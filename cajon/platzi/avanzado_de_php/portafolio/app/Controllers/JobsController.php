<?php

namespace App\Controllers;

use Respect\Validation\Validator as v;
use App\Models\{Job};

class JobsController extends BaseController
{

	public function getAddJobAction($request)
	{
		$responseMessage = null;
		
		if ($request->getMethod() == 'POST')
		{
			$postData = $request->getParsedBody();
			
			$jobValidator = v::key('title', v::stringType()->notEmpty())
				->key('description', v::stringType()->notEmpty());
			
			// probando el assert
			// var_dump($jobValidator->assert($postData));
			
			try
			{
				$jobValidator->assert($postData);
				
				$job = new Job();
				$job->title = $postData['title'];
				$job->description = $postData['description'];
				$job->months = $postData['months'];
				
				$files = $request->getUploadedFiles();
				$image = $files['logo'];
				
				$filePath = 'uploads';
				if ($image->getError() == UPLOAD_ERR_OK)
				{
					$fileName = $filePath.'/'.$image->getClientFilename();
					$image->moveTo($fileName);
					$job->image = $fileName;
				}
				
				$job->save();
				
				$responseMessage = 'Saved';
			}
			catch(\Exception $e)
			{
				// probando el mensaje
				// var_dump($e->getFullMessage());
				$responseMessage = $e->getMessage();
			}
		}
		
		return $this->renderHTML('addJob.twig', [
			'responseMessage' => $responseMessage,
		]);
	}
}

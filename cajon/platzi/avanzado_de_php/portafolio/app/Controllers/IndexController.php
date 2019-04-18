<?php

namespace App\Controllers;

use App\Models\{Job, Proyect};

class IndexController extends BaseController
{

	public function indexAction()
	{
		$name = "Abrahan Omaña";

		$jobs = Job::all();

		$limitMonths = 15;
		$filterFunction = function (array $job) use ($limitMonths){
			return $job['months']>= $limitMonths;
		};
		$jobs = array_filter($jobs->toArray(), $filterFunction);

		return $this->renderHTML('index.twig', [
			'name' => $name,
			'jobs' => $jobs,
		]);
	}
}

package org.springframework.social.daum.api;

import org.springframework.social.ApiBinding;

public interface Daum extends ApiBinding, DaumRestApi {
	UserOperations userOperation();
	
	CafeOperations cafeOperation();

	BlogOperations blogOperations();
	
	SearchOperations searchOperations();
	
}

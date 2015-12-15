package org.springframework.social.daum.api;

import org.springframework.social.ApiBinding;

public interface Daum extends ApiBinding, DaumRestApi {

	UserOperations userOperation();

	CafeOperations cafeOperation();

	BlogOperations blogOperations();

	SearchOperations searchOperations();

	// TODO 캘린더, 영화(콘텐츠) 쇼핑
	CalendarOperations calendarOperations();

	ContentsOperations contentsOperations();

	ShopingOperations shopingOperations();

}

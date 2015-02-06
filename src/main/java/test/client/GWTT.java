package test.client;

import test.client.test2.MyWidgetGinjector;

import com.google.gwt.core.client.EntryPoint;



public class GWTT implements EntryPoint {


	public void onModuleLoad() {

	 MyWidgetGinjector injector = Dagger_MyWidgetGinjector.create();
//		 SomeService service = injector.getSomeService();
//		
//		 service.test();

	}
}

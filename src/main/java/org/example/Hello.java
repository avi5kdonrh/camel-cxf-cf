/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.example;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://example.org/", name = "Hello")
public interface Hello {

    @RequestWrapper(localName = "TestRequest",
                    targetNamespace = "http://example.org/", 
                    className = "org.example.TestRequest")
    @WebMethod(operationName = "TestRequest", action = "http://example.org/TestRequest")
    @ResponseWrapper(localName = "TestRequestResponse",
                     targetNamespace = "http://example.org/", 
                     className = "org.example.TestRequestResponse")
    public void testRequest(
            @WebParam(name = "Id", targetNamespace = "http://example.org/")
                    int id,
            @WebParam(name = "val1", targetNamespace = "http://example.org/")
                    java.lang.String val1,
            @WebParam(mode = WebParam.Mode.INOUT, name = "val2", targetNamespace = "http://example.org/")
                    javax.xml.ws.Holder<java.lang.String> val2,
            @WebParam(mode = WebParam.Mode.OUT, name = "result", targetNamespace = "http://example.org/")
                    javax.xml.ws.Holder<java.lang.Boolean> result
    );
}

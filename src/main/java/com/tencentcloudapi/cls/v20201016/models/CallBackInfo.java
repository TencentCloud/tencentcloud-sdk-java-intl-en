/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallBackInfo extends AbstractModel {

    /**
    * Callback Body.
Place various alarm variables in the request content. For details, see the help documentation (https://www.tencentcloud.com/document/product/614/74718?from_cn_redirect=1).
in the following example:

```
{
"TopicId": "{{ .QueryLog[0][0].topicId }}",
"key": "{{.Alarm}}",
"time": "{{ .QueryLog[0][0].time }}",
"log": "{{ .QueryLog[0][0].content.__CONTENT__ }}",
"namespace": "{{ .QueryLog[0][0].content.__TAG__.namespace }}"
}
```
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * HTTP request header field for callbacks.
For example, the following request header field informs the server request content type is JSON.
```
"Content-Type: application/json"
```
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
     * Get Callback Body.
Place various alarm variables in the request content. For details, see the help documentation (https://www.tencentcloud.com/document/product/614/74718?from_cn_redirect=1).
in the following example:

```
{
"TopicId": "{{ .QueryLog[0][0].topicId }}",
"key": "{{.Alarm}}",
"time": "{{ .QueryLog[0][0].time }}",
"log": "{{ .QueryLog[0][0].content.__CONTENT__ }}",
"namespace": "{{ .QueryLog[0][0].content.__TAG__.namespace }}"
}
``` 
     * @return Body Callback Body.
Place various alarm variables in the request content. For details, see the help documentation (https://www.tencentcloud.com/document/product/614/74718?from_cn_redirect=1).
in the following example:

```
{
"TopicId": "{{ .QueryLog[0][0].topicId }}",
"key": "{{.Alarm}}",
"time": "{{ .QueryLog[0][0].time }}",
"log": "{{ .QueryLog[0][0].content.__CONTENT__ }}",
"namespace": "{{ .QueryLog[0][0].content.__TAG__.namespace }}"
}
```
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set Callback Body.
Place various alarm variables in the request content. For details, see the help documentation (https://www.tencentcloud.com/document/product/614/74718?from_cn_redirect=1).
in the following example:

```
{
"TopicId": "{{ .QueryLog[0][0].topicId }}",
"key": "{{.Alarm}}",
"time": "{{ .QueryLog[0][0].time }}",
"log": "{{ .QueryLog[0][0].content.__CONTENT__ }}",
"namespace": "{{ .QueryLog[0][0].content.__TAG__.namespace }}"
}
```
     * @param Body Callback Body.
Place various alarm variables in the request content. For details, see the help documentation (https://www.tencentcloud.com/document/product/614/74718?from_cn_redirect=1).
in the following example:

```
{
"TopicId": "{{ .QueryLog[0][0].topicId }}",
"key": "{{.Alarm}}",
"time": "{{ .QueryLog[0][0].time }}",
"log": "{{ .QueryLog[0][0].content.__CONTENT__ }}",
"namespace": "{{ .QueryLog[0][0].content.__TAG__.namespace }}"
}
```
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get HTTP request header field for callbacks.
For example, the following request header field informs the server request content type is JSON.
```
"Content-Type: application/json"
``` 
     * @return Headers HTTP request header field for callbacks.
For example, the following request header field informs the server request content type is JSON.
```
"Content-Type: application/json"
```
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set HTTP request header field for callbacks.
For example, the following request header field informs the server request content type is JSON.
```
"Content-Type: application/json"
```
     * @param Headers HTTP request header field for callbacks.
For example, the following request header field informs the server request content type is JSON.
```
"Content-Type: application/json"
```
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    public CallBackInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallBackInfo(CallBackInfo source) {
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);

    }
}


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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAssetTotalCountResponse extends AbstractModel {

    /**
    * Number of individual resources
system: resource monitoring
account: account
port: port
process: process
app: application software
database: database
webapp: Web application
webframe: Web framework
webservice: Web service
weblocation: Web site
jar: Jar package
initservice: startup service
planTask: scheduled task
env: environment variable
coremodule: kernel module
    */
    @SerializedName("Types")
    @Expose
    private AssetKeyVal [] Types;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of individual resources
system: resource monitoring
account: account
port: port
process: process
app: application software
database: database
webapp: Web application
webframe: Web framework
webservice: Web service
weblocation: Web site
jar: Jar package
initservice: startup service
planTask: scheduled task
env: environment variable
coremodule: kernel module 
     * @return Types Number of individual resources
system: resource monitoring
account: account
port: port
process: process
app: application software
database: database
webapp: Web application
webframe: Web framework
webservice: Web service
weblocation: Web site
jar: Jar package
initservice: startup service
planTask: scheduled task
env: environment variable
coremodule: kernel module
     */
    public AssetKeyVal [] getTypes() {
        return this.Types;
    }

    /**
     * Set Number of individual resources
system: resource monitoring
account: account
port: port
process: process
app: application software
database: database
webapp: Web application
webframe: Web framework
webservice: Web service
weblocation: Web site
jar: Jar package
initservice: startup service
planTask: scheduled task
env: environment variable
coremodule: kernel module
     * @param Types Number of individual resources
system: resource monitoring
account: account
port: port
process: process
app: application software
database: database
webapp: Web application
webframe: Web framework
webservice: Web service
weblocation: Web site
jar: Jar package
initservice: startup service
planTask: scheduled task
env: environment variable
coremodule: kernel module
     */
    public void setTypes(AssetKeyVal [] Types) {
        this.Types = Types;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAssetTotalCountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAssetTotalCountResponse(DescribeAssetTotalCountResponse source) {
        if (source.Types != null) {
            this.Types = new AssetKeyVal[source.Types.length];
            for (int i = 0; i < source.Types.length; i++) {
                this.Types[i] = new AssetKeyVal(source.Types[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Types.", this.Types);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


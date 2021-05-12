/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccountResponse extends AbstractModel{

    /**
    * Instance ID, which is passed through from the input parameters.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Username, which is passed through from the input parameters.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Host allowed for access, which is passed through from the input parameters.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * Passed through from the input parameters.
    */
    @SerializedName("ReadOnly")
    @Expose
    private Long ReadOnly;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance ID, which is passed through from the input parameters. 
     * @return InstanceId Instance ID, which is passed through from the input parameters.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which is passed through from the input parameters.
     * @param InstanceId Instance ID, which is passed through from the input parameters.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Username, which is passed through from the input parameters. 
     * @return UserName Username, which is passed through from the input parameters.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Username, which is passed through from the input parameters.
     * @param UserName Username, which is passed through from the input parameters.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Host allowed for access, which is passed through from the input parameters. 
     * @return Host Host allowed for access, which is passed through from the input parameters.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set Host allowed for access, which is passed through from the input parameters.
     * @param Host Host allowed for access, which is passed through from the input parameters.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get Passed through from the input parameters. 
     * @return ReadOnly Passed through from the input parameters.
     */
    public Long getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * Set Passed through from the input parameters.
     * @param ReadOnly Passed through from the input parameters.
     */
    public void setReadOnly(Long ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateAccountResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAccountResponse(CreateAccountResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.ReadOnly != null) {
            this.ReadOnly = new Long(source.ReadOnly);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


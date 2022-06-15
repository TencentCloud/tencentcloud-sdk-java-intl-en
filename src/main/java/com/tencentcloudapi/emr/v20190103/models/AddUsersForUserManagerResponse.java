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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUsersForUserManagerResponse extends AbstractModel{

    /**
    * The user list that is successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("SuccessUserList")
    @Expose
    private String [] SuccessUserList;

    /**
    * The user list that is not successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("FailedUserList")
    @Expose
    private String [] FailedUserList;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The user list that is successfully added
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return SuccessUserList The user list that is successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getSuccessUserList() {
        return this.SuccessUserList;
    }

    /**
     * Set The user list that is successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param SuccessUserList The user list that is successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setSuccessUserList(String [] SuccessUserList) {
        this.SuccessUserList = SuccessUserList;
    }

    /**
     * Get The user list that is not successfully added
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return FailedUserList The user list that is not successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getFailedUserList() {
        return this.FailedUserList;
    }

    /**
     * Set The user list that is not successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param FailedUserList The user list that is not successfully added
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setFailedUserList(String [] FailedUserList) {
        this.FailedUserList = FailedUserList;
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

    public AddUsersForUserManagerResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddUsersForUserManagerResponse(AddUsersForUserManagerResponse source) {
        if (source.SuccessUserList != null) {
            this.SuccessUserList = new String[source.SuccessUserList.length];
            for (int i = 0; i < source.SuccessUserList.length; i++) {
                this.SuccessUserList[i] = new String(source.SuccessUserList[i]);
            }
        }
        if (source.FailedUserList != null) {
            this.FailedUserList = new String[source.FailedUserList.length];
            for (int i = 0; i < source.FailedUserList.length; i++) {
                this.FailedUserList[i] = new String(source.FailedUserList[i]);
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
        this.setParamArraySimple(map, prefix + "SuccessUserList.", this.SuccessUserList);
        this.setParamArraySimple(map, prefix + "FailedUserList.", this.FailedUserList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


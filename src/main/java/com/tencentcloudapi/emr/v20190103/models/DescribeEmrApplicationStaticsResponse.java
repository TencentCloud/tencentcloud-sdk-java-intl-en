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

public class DescribeEmrApplicationStaticsResponse extends AbstractModel{

    /**
    * Application statistics
    */
    @SerializedName("Statics")
    @Expose
    private ApplicationStatics [] Statics;

    /**
    * Total count
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Available queue name
    */
    @SerializedName("Queues")
    @Expose
    private String [] Queues;

    /**
    * Available usernames
    */
    @SerializedName("Users")
    @Expose
    private String [] Users;

    /**
    * Available application type
    */
    @SerializedName("ApplicationTypes")
    @Expose
    private String [] ApplicationTypes;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Application statistics 
     * @return Statics Application statistics
     */
    public ApplicationStatics [] getStatics() {
        return this.Statics;
    }

    /**
     * Set Application statistics
     * @param Statics Application statistics
     */
    public void setStatics(ApplicationStatics [] Statics) {
        this.Statics = Statics;
    }

    /**
     * Get Total count 
     * @return TotalCount Total count
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total count
     * @param TotalCount Total count
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Available queue name 
     * @return Queues Available queue name
     */
    public String [] getQueues() {
        return this.Queues;
    }

    /**
     * Set Available queue name
     * @param Queues Available queue name
     */
    public void setQueues(String [] Queues) {
        this.Queues = Queues;
    }

    /**
     * Get Available usernames 
     * @return Users Available usernames
     */
    public String [] getUsers() {
        return this.Users;
    }

    /**
     * Set Available usernames
     * @param Users Available usernames
     */
    public void setUsers(String [] Users) {
        this.Users = Users;
    }

    /**
     * Get Available application type 
     * @return ApplicationTypes Available application type
     */
    public String [] getApplicationTypes() {
        return this.ApplicationTypes;
    }

    /**
     * Set Available application type
     * @param ApplicationTypes Available application type
     */
    public void setApplicationTypes(String [] ApplicationTypes) {
        this.ApplicationTypes = ApplicationTypes;
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

    public DescribeEmrApplicationStaticsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEmrApplicationStaticsResponse(DescribeEmrApplicationStaticsResponse source) {
        if (source.Statics != null) {
            this.Statics = new ApplicationStatics[source.Statics.length];
            for (int i = 0; i < source.Statics.length; i++) {
                this.Statics[i] = new ApplicationStatics(source.Statics[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Queues != null) {
            this.Queues = new String[source.Queues.length];
            for (int i = 0; i < source.Queues.length; i++) {
                this.Queues[i] = new String(source.Queues[i]);
            }
        }
        if (source.Users != null) {
            this.Users = new String[source.Users.length];
            for (int i = 0; i < source.Users.length; i++) {
                this.Users[i] = new String(source.Users[i]);
            }
        }
        if (source.ApplicationTypes != null) {
            this.ApplicationTypes = new String[source.ApplicationTypes.length];
            for (int i = 0; i < source.ApplicationTypes.length; i++) {
                this.ApplicationTypes[i] = new String(source.ApplicationTypes[i]);
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
        this.setParamArrayObj(map, prefix + "Statics.", this.Statics);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArraySimple(map, prefix + "Queues.", this.Queues);
        this.setParamArraySimple(map, prefix + "Users.", this.Users);
        this.setParamArraySimple(map, prefix + "ApplicationTypes.", this.ApplicationTypes);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}


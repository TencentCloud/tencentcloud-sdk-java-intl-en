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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConcurrencyLimitDetail extends AbstractModel {

    /**
    * <p>Call source (subject_type determines the meaning of subject_id/subject_name. For example, for APP, subject_id=app_id and subject_name=app_name)</p>
    */
    @SerializedName("CallSource")
    @Expose
    private CallSource CallSource;

    /**
    * <p>Time when the limit was exceeded (Unix seconds)</p>
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * <p>Model name</p>
    */
    @SerializedName("ModelName")
    @Expose
    private String ModelName;

    /**
    * <p>Request content (the original query text of the user request)</p>
    */
    @SerializedName("RequestQuery")
    @Expose
    private String RequestQuery;

    /**
    * <p>Space ID</p>
    */
    @SerializedName("SpaceId")
    @Expose
    private String SpaceId;

    /**
     * Get <p>Call source (subject_type determines the meaning of subject_id/subject_name. For example, for APP, subject_id=app_id and subject_name=app_name)</p> 
     * @return CallSource <p>Call source (subject_type determines the meaning of subject_id/subject_name. For example, for APP, subject_id=app_id and subject_name=app_name)</p>
     */
    public CallSource getCallSource() {
        return this.CallSource;
    }

    /**
     * Set <p>Call source (subject_type determines the meaning of subject_id/subject_name. For example, for APP, subject_id=app_id and subject_name=app_name)</p>
     * @param CallSource <p>Call source (subject_type determines the meaning of subject_id/subject_name. For example, for APP, subject_id=app_id and subject_name=app_name)</p>
     */
    public void setCallSource(CallSource CallSource) {
        this.CallSource = CallSource;
    }

    /**
     * Get <p>Time when the limit was exceeded (Unix seconds)</p> 
     * @return EventTime <p>Time when the limit was exceeded (Unix seconds)</p>
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * Set <p>Time when the limit was exceeded (Unix seconds)</p>
     * @param EventTime <p>Time when the limit was exceeded (Unix seconds)</p>
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * Get <p>Model name</p> 
     * @return ModelName <p>Model name</p>
     */
    public String getModelName() {
        return this.ModelName;
    }

    /**
     * Set <p>Model name</p>
     * @param ModelName <p>Model name</p>
     */
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    /**
     * Get <p>Request content (the original query text of the user request)</p> 
     * @return RequestQuery <p>Request content (the original query text of the user request)</p>
     */
    public String getRequestQuery() {
        return this.RequestQuery;
    }

    /**
     * Set <p>Request content (the original query text of the user request)</p>
     * @param RequestQuery <p>Request content (the original query text of the user request)</p>
     */
    public void setRequestQuery(String RequestQuery) {
        this.RequestQuery = RequestQuery;
    }

    /**
     * Get <p>Space ID</p> 
     * @return SpaceId <p>Space ID</p>
     */
    public String getSpaceId() {
        return this.SpaceId;
    }

    /**
     * Set <p>Space ID</p>
     * @param SpaceId <p>Space ID</p>
     */
    public void setSpaceId(String SpaceId) {
        this.SpaceId = SpaceId;
    }

    public ConcurrencyLimitDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConcurrencyLimitDetail(ConcurrencyLimitDetail source) {
        if (source.CallSource != null) {
            this.CallSource = new CallSource(source.CallSource);
        }
        if (source.EventTime != null) {
            this.EventTime = new String(source.EventTime);
        }
        if (source.ModelName != null) {
            this.ModelName = new String(source.ModelName);
        }
        if (source.RequestQuery != null) {
            this.RequestQuery = new String(source.RequestQuery);
        }
        if (source.SpaceId != null) {
            this.SpaceId = new String(source.SpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "CallSource.", this.CallSource);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "ModelName", this.ModelName);
        this.setParamSimple(map, prefix + "RequestQuery", this.RequestQuery);
        this.setParamSimple(map, prefix + "SpaceId", this.SpaceId);

    }
}


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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEventsRequest extends AbstractModel{

    /**
    * Start timestamp in seconds (cannot be 90 days after the current time).
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End timestamp in seconds (the time range for query is less than 30 days).
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Credential for viewing more logs.
    */
    @SerializedName("NextToken")
    @Expose
    private Long NextToken;

    /**
    * Max number of returned logs (up to 50).
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Search criterion. Valid values: RequestId, EventName, ActionType (write/read), PrincipalId (sub-account), ResourceType, ResourceName, AccessKeyId, SensitiveAction, ApiErrorCode, and CamErrorCode.
    */
    @SerializedName("LookupAttributes")
    @Expose
    private LookupAttribute [] LookupAttributes;

    /**
    * Whether to return the IP location. `1`: yes, `0`: no.
    */
    @SerializedName("IsReturnLocation")
    @Expose
    private Long IsReturnLocation;

    /**
     * Get Start timestamp in seconds (cannot be 90 days after the current time). 
     * @return StartTime Start timestamp in seconds (cannot be 90 days after the current time).
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp in seconds (cannot be 90 days after the current time).
     * @param StartTime Start timestamp in seconds (cannot be 90 days after the current time).
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End timestamp in seconds (the time range for query is less than 30 days). 
     * @return EndTime End timestamp in seconds (the time range for query is less than 30 days).
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End timestamp in seconds (the time range for query is less than 30 days).
     * @param EndTime End timestamp in seconds (the time range for query is less than 30 days).
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Credential for viewing more logs. 
     * @return NextToken Credential for viewing more logs.
     */
    public Long getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Credential for viewing more logs.
     * @param NextToken Credential for viewing more logs.
     */
    public void setNextToken(Long NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Max number of returned logs (up to 50). 
     * @return MaxResults Max number of returned logs (up to 50).
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Max number of returned logs (up to 50).
     * @param MaxResults Max number of returned logs (up to 50).
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Search criterion. Valid values: RequestId, EventName, ActionType (write/read), PrincipalId (sub-account), ResourceType, ResourceName, AccessKeyId, SensitiveAction, ApiErrorCode, and CamErrorCode. 
     * @return LookupAttributes Search criterion. Valid values: RequestId, EventName, ActionType (write/read), PrincipalId (sub-account), ResourceType, ResourceName, AccessKeyId, SensitiveAction, ApiErrorCode, and CamErrorCode.
     */
    public LookupAttribute [] getLookupAttributes() {
        return this.LookupAttributes;
    }

    /**
     * Set Search criterion. Valid values: RequestId, EventName, ActionType (write/read), PrincipalId (sub-account), ResourceType, ResourceName, AccessKeyId, SensitiveAction, ApiErrorCode, and CamErrorCode.
     * @param LookupAttributes Search criterion. Valid values: RequestId, EventName, ActionType (write/read), PrincipalId (sub-account), ResourceType, ResourceName, AccessKeyId, SensitiveAction, ApiErrorCode, and CamErrorCode.
     */
    public void setLookupAttributes(LookupAttribute [] LookupAttributes) {
        this.LookupAttributes = LookupAttributes;
    }

    /**
     * Get Whether to return the IP location. `1`: yes, `0`: no. 
     * @return IsReturnLocation Whether to return the IP location. `1`: yes, `0`: no.
     */
    public Long getIsReturnLocation() {
        return this.IsReturnLocation;
    }

    /**
     * Set Whether to return the IP location. `1`: yes, `0`: no.
     * @param IsReturnLocation Whether to return the IP location. `1`: yes, `0`: no.
     */
    public void setIsReturnLocation(Long IsReturnLocation) {
        this.IsReturnLocation = IsReturnLocation;
    }

    public DescribeEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEventsRequest(DescribeEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.NextToken != null) {
            this.NextToken = new Long(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.LookupAttributes != null) {
            this.LookupAttributes = new LookupAttribute[source.LookupAttributes.length];
            for (int i = 0; i < source.LookupAttributes.length; i++) {
                this.LookupAttributes[i] = new LookupAttribute(source.LookupAttributes[i]);
            }
        }
        if (source.IsReturnLocation != null) {
            this.IsReturnLocation = new Long(source.IsReturnLocation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamArrayObj(map, prefix + "LookupAttributes.", this.LookupAttributes);
        this.setParamSimple(map, prefix + "IsReturnLocation", this.IsReturnLocation);

    }
}


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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LookUpEventsRequest extends AbstractModel {

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Search criteria
    */
    @SerializedName("LookupAttributes")
    @Expose
    private LookupAttribute [] LookupAttributes;

    /**
    * Credential for viewing more logs
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * Maximum number of logs to be returned
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * CloudAudit mode. Valid values: standard, quick. Default value: standard
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time 
     * @return EndTime End time
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
     * @param EndTime End time
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Search criteria 
     * @return LookupAttributes Search criteria
     */
    public LookupAttribute [] getLookupAttributes() {
        return this.LookupAttributes;
    }

    /**
     * Set Search criteria
     * @param LookupAttributes Search criteria
     */
    public void setLookupAttributes(LookupAttribute [] LookupAttributes) {
        this.LookupAttributes = LookupAttributes;
    }

    /**
     * Get Credential for viewing more logs 
     * @return NextToken Credential for viewing more logs
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Credential for viewing more logs
     * @param NextToken Credential for viewing more logs
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get Maximum number of logs to be returned 
     * @return MaxResults Maximum number of logs to be returned
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of logs to be returned
     * @param MaxResults Maximum number of logs to be returned
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get CloudAudit mode. Valid values: standard, quick. Default value: standard 
     * @return Mode CloudAudit mode. Valid values: standard, quick. Default value: standard
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set CloudAudit mode. Valid values: standard, quick. Default value: standard
     * @param Mode CloudAudit mode. Valid values: standard, quick. Default value: standard
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    public LookUpEventsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LookUpEventsRequest(LookUpEventsRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.LookupAttributes != null) {
            this.LookupAttributes = new LookupAttribute[source.LookupAttributes.length];
            for (int i = 0; i < source.LookupAttributes.length; i++) {
                this.LookupAttributes[i] = new LookupAttribute(source.LookupAttributes[i]);
            }
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "LookupAttributes.", this.LookupAttributes);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}


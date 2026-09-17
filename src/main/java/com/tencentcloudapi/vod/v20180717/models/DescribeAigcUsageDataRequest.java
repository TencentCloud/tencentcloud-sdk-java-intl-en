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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAigcUsageDataRequest extends AbstractModel {

    /**
    * 
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 
    */
    @SerializedName("AigcType")
    @Expose
    private String AigcType;

    /**
    * 
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>API Key</p>
    */
    @SerializedName("APIKey")
    @Expose
    private String APIKey;

    /**
    * <p>API Key</p>
    */
    @SerializedName("APIKeys")
    @Expose
    private String [] APIKeys;

    /**
    * 
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * 
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
     * Get  
     * @return StartTime 
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 
     * @param StartTime 
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get  
     * @return EndTime 
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 
     * @param EndTime 
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get  
     * @return AigcType 
     */
    public String getAigcType() {
        return this.AigcType;
    }

    /**
     * Set 
     * @param AigcType 
     */
    public void setAigcType(String AigcType) {
        this.AigcType = AigcType;
    }

    /**
     * Get  
     * @return SubAppId 
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 
     * @param SubAppId 
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>API Key</p> 
     * @return APIKey <p>API Key</p>
     */
    public String getAPIKey() {
        return this.APIKey;
    }

    /**
     * Set <p>API Key</p>
     * @param APIKey <p>API Key</p>
     */
    public void setAPIKey(String APIKey) {
        this.APIKey = APIKey;
    }

    /**
     * Get <p>API Key</p> 
     * @return APIKeys <p>API Key</p>
     */
    public String [] getAPIKeys() {
        return this.APIKeys;
    }

    /**
     * Set <p>API Key</p>
     * @param APIKeys <p>API Key</p>
     */
    public void setAPIKeys(String [] APIKeys) {
        this.APIKeys = APIKeys;
    }

    /**
     * Get  
     * @return ScrollToken 
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set 
     * @param ScrollToken 
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get  
     * @return PageSize 
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 
     * @param PageSize 
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get  
     * @return ReqId 
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set 
     * @param ReqId 
     */
    public void setReqId(String ReqId) {
        this.ReqId = ReqId;
    }

    public DescribeAigcUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAigcUsageDataRequest(DescribeAigcUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.AigcType != null) {
            this.AigcType = new String(source.AigcType);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.APIKey != null) {
            this.APIKey = new String(source.APIKey);
        }
        if (source.APIKeys != null) {
            this.APIKeys = new String[source.APIKeys.length];
            for (int i = 0; i < source.APIKeys.length; i++) {
                this.APIKeys[i] = new String(source.APIKeys[i]);
            }
        }
        if (source.ScrollToken != null) {
            this.ScrollToken = new String(source.ScrollToken);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.ReqId != null) {
            this.ReqId = new String(source.ReqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "AigcType", this.AigcType);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "APIKey", this.APIKey);
        this.setParamArraySimple(map, prefix + "APIKeys.", this.APIKeys);
        this.setParamSimple(map, prefix + "ScrollToken", this.ScrollToken);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ReqId", this.ReqId);

    }
}


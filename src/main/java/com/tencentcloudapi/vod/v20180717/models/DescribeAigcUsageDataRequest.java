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
    * <p>Start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <p>AIGC type.</p><p>Enumeration values:</p><ul><li>Video: Video</li><li>Image: Image</li><li>Text: Text</li><li>Audio: Audio</li><li>SceneAigcVideo: Scenario-based video processing</li><li>SceneAigcImage: Scenario-based image processing</li><li>SceneAigcTime: Scenario-based processing times</li><li>TextDetail: Text detailed record</li></ul>
    */
    @SerializedName("AigcType")
    @Expose
    private String AigcType;

    /**
    * <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
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
    * <p>Query cursor</p>
    */
    @SerializedName("ScrollToken")
    @Expose
    private String ScrollToken;

    /**
    * <p>Size per page, maximum 200, it will be truncated to 200</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * <p>RequestId of the raw text. Valid at that time when AigcType is TextDetail.</p>
    */
    @SerializedName("ReqId")
    @Expose
    private String ReqId;

    /**
     * Get <p>Start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p> 
     * @return StartTime <p>Start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
     * @param StartTime <p>Start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p> 
     * @return EndTime <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
     * @param EndTime <p>End date, which must be greater than or equal to the start date. Use the <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52">ISO date format</a>.</p>
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <p>AIGC type.</p><p>Enumeration values:</p><ul><li>Video: Video</li><li>Image: Image</li><li>Text: Text</li><li>Audio: Audio</li><li>SceneAigcVideo: Scenario-based video processing</li><li>SceneAigcImage: Scenario-based image processing</li><li>SceneAigcTime: Scenario-based processing times</li><li>TextDetail: Text detailed record</li></ul> 
     * @return AigcType <p>AIGC type.</p><p>Enumeration values:</p><ul><li>Video: Video</li><li>Image: Image</li><li>Text: Text</li><li>Audio: Audio</li><li>SceneAigcVideo: Scenario-based video processing</li><li>SceneAigcImage: Scenario-based image processing</li><li>SceneAigcTime: Scenario-based processing times</li><li>TextDetail: Text detailed record</li></ul>
     */
    public String getAigcType() {
        return this.AigcType;
    }

    /**
     * Set <p>AIGC type.</p><p>Enumeration values:</p><ul><li>Video: Video</li><li>Image: Image</li><li>Text: Text</li><li>Audio: Audio</li><li>SceneAigcVideo: Scenario-based video processing</li><li>SceneAigcImage: Scenario-based image processing</li><li>SceneAigcTime: Scenario-based processing times</li><li>TextDetail: Text detailed record</li></ul>
     * @param AigcType <p>AIGC type.</p><p>Enumeration values:</p><ul><li>Video: Video</li><li>Image: Image</li><li>Text: Text</li><li>Audio: Audio</li><li>SceneAigcVideo: Scenario-based video processing</li><li>SceneAigcImage: Scenario-based image processing</li><li>SceneAigcTime: Scenario-based processing times</li><li>TextDetail: Text detailed record</li></ul>
     */
    public void setAigcType(String AigcType) {
        this.AigcType = AigcType;
    }

    /**
     * Get <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>VOD <a href="/document/product/266/14574?from_cn_redirect=1">application</a> ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
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
     * Get <p>Query cursor</p> 
     * @return ScrollToken <p>Query cursor</p>
     */
    public String getScrollToken() {
        return this.ScrollToken;
    }

    /**
     * Set <p>Query cursor</p>
     * @param ScrollToken <p>Query cursor</p>
     */
    public void setScrollToken(String ScrollToken) {
        this.ScrollToken = ScrollToken;
    }

    /**
     * Get <p>Size per page, maximum 200, it will be truncated to 200</p> 
     * @return PageSize <p>Size per page, maximum 200, it will be truncated to 200</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Size per page, maximum 200, it will be truncated to 200</p>
     * @param PageSize <p>Size per page, maximum 200, it will be truncated to 200</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get <p>RequestId of the raw text. Valid at that time when AigcType is TextDetail.</p> 
     * @return ReqId <p>RequestId of the raw text. Valid at that time when AigcType is TextDetail.</p>
     */
    public String getReqId() {
        return this.ReqId;
    }

    /**
     * Set <p>RequestId of the raw text. Valid at that time when AigcType is TextDetail.</p>
     * @param ReqId <p>RequestId of the raw text. Valid at that time when AigcType is TextDetail.</p>
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


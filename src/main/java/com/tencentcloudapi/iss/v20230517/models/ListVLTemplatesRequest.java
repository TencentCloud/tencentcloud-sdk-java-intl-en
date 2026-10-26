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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListVLTemplatesRequest extends AbstractModel {

    /**
    * <p>Template name, exact match</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Analysis mode filter, image / video</p>
    */
    @SerializedName("AnalysisMode")
    @Expose
    private String AnalysisMode;

    /**
    * <p>Screenshot type filter (this parameter is valid only when AnalysisMode=image): realtime/low</p>
    */
    @SerializedName("CaptureType")
    @Expose
    private String CaptureType;

    /**
    * <p>Page number, which is 1 by default.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page. Default value: 20. Maximum value: 200.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>Template name, exact match</p> 
     * @return Name <p>Template name, exact match</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name, exact match</p>
     * @param Name <p>Template name, exact match</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Analysis mode filter, image / video</p> 
     * @return AnalysisMode <p>Analysis mode filter, image / video</p>
     */
    public String getAnalysisMode() {
        return this.AnalysisMode;
    }

    /**
     * Set <p>Analysis mode filter, image / video</p>
     * @param AnalysisMode <p>Analysis mode filter, image / video</p>
     */
    public void setAnalysisMode(String AnalysisMode) {
        this.AnalysisMode = AnalysisMode;
    }

    /**
     * Get <p>Screenshot type filter (this parameter is valid only when AnalysisMode=image): realtime/low</p> 
     * @return CaptureType <p>Screenshot type filter (this parameter is valid only when AnalysisMode=image): realtime/low</p>
     */
    public String getCaptureType() {
        return this.CaptureType;
    }

    /**
     * Set <p>Screenshot type filter (this parameter is valid only when AnalysisMode=image): realtime/low</p>
     * @param CaptureType <p>Screenshot type filter (this parameter is valid only when AnalysisMode=image): realtime/low</p>
     */
    public void setCaptureType(String CaptureType) {
        this.CaptureType = CaptureType;
    }

    /**
     * Get <p>Page number, which is 1 by default.</p> 
     * @return PageNumber <p>Page number, which is 1 by default.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number, which is 1 by default.</p>
     * @param PageNumber <p>Page number, which is 1 by default.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page. Default value: 20. Maximum value: 200.</p> 
     * @return PageSize <p>Number of items per page. Default value: 20. Maximum value: 200.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page. Default value: 20. Maximum value: 200.</p>
     * @param PageSize <p>Number of items per page. Default value: 20. Maximum value: 200.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListVLTemplatesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListVLTemplatesRequest(ListVLTemplatesRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AnalysisMode != null) {
            this.AnalysisMode = new String(source.AnalysisMode);
        }
        if (source.CaptureType != null) {
            this.CaptureType = new String(source.CaptureType);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AnalysisMode", this.AnalysisMode);
        this.setParamSimple(map, prefix + "CaptureType", this.CaptureType);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}


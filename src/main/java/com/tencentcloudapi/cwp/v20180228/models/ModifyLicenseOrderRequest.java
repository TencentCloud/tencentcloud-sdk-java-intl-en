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

public class ModifyLicenseOrderRequest extends AbstractModel {

    /**
    * Resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Expected value. If the current value is 10, fill in a larger value for scale-out, a smaller value for scale-down (the expected value must be no less than the usage value during scale-down), or the same value for no change.
    */
    @SerializedName("InquireNum")
    @Expose
    private Long InquireNum;

    /**
    * Project ID. Fill in the original value for no change.
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Resource alias. Fill in the original value for no change.
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
     * Get Resource ID 
     * @return ResourceId Resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID
     * @param ResourceId Resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Expected value. If the current value is 10, fill in a larger value for scale-out, a smaller value for scale-down (the expected value must be no less than the usage value during scale-down), or the same value for no change. 
     * @return InquireNum Expected value. If the current value is 10, fill in a larger value for scale-out, a smaller value for scale-down (the expected value must be no less than the usage value during scale-down), or the same value for no change.
     */
    public Long getInquireNum() {
        return this.InquireNum;
    }

    /**
     * Set Expected value. If the current value is 10, fill in a larger value for scale-out, a smaller value for scale-down (the expected value must be no less than the usage value during scale-down), or the same value for no change.
     * @param InquireNum Expected value. If the current value is 10, fill in a larger value for scale-out, a smaller value for scale-down (the expected value must be no less than the usage value during scale-down), or the same value for no change.
     */
    public void setInquireNum(Long InquireNum) {
        this.InquireNum = InquireNum;
    }

    /**
     * Get Project ID. Fill in the original value for no change. 
     * @return ProjectId Project ID. Fill in the original value for no change.
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID. Fill in the original value for no change.
     * @param ProjectId Project ID. Fill in the original value for no change.
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Resource alias. Fill in the original value for no change. 
     * @return Alias Resource alias. Fill in the original value for no change.
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Resource alias. Fill in the original value for no change.
     * @param Alias Resource alias. Fill in the original value for no change.
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public ModifyLicenseOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLicenseOrderRequest(ModifyLicenseOrderRequest source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.InquireNum != null) {
            this.InquireNum = new Long(source.InquireNum);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "InquireNum", this.InquireNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);

    }
}


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

public class VLPlanInfo extends AbstractModel {

    /**
    * <p>Plan ID</p>
    */
    @SerializedName("VLPlanId")
    @Expose
    private String VLPlanId;

    /**
    * <p>Plan name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Plan description.</p>
    */
    @SerializedName("Describe")
    @Expose
    private String Describe;

    /**
    * <p>ID of the visual understanding template</p>
    */
    @SerializedName("VLTemplateId")
    @Expose
    private String VLTemplateId;

    /**
    * <p>Callback notification configuration</p>
    */
    @SerializedName("Callback")
    @Expose
    private CallbackURL Callback;

    /**
    * <p>File expiration time (seconds)</p>
    */
    @SerializedName("FileExpires")
    @Expose
    private Long FileExpires;

    /**
    * <p>Number of channels included in the plan</p>
    */
    @SerializedName("ChannelCount")
    @Expose
    private Long ChannelCount;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>Last update time</p>
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
     * Get <p>Plan ID</p> 
     * @return VLPlanId <p>Plan ID</p>
     */
    public String getVLPlanId() {
        return this.VLPlanId;
    }

    /**
     * Set <p>Plan ID</p>
     * @param VLPlanId <p>Plan ID</p>
     */
    public void setVLPlanId(String VLPlanId) {
        this.VLPlanId = VLPlanId;
    }

    /**
     * Get <p>Plan name.</p> 
     * @return Name <p>Plan name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Plan name.</p>
     * @param Name <p>Plan name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Plan description.</p> 
     * @return Describe <p>Plan description.</p>
     */
    public String getDescribe() {
        return this.Describe;
    }

    /**
     * Set <p>Plan description.</p>
     * @param Describe <p>Plan description.</p>
     */
    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    /**
     * Get <p>ID of the visual understanding template</p> 
     * @return VLTemplateId <p>ID of the visual understanding template</p>
     */
    public String getVLTemplateId() {
        return this.VLTemplateId;
    }

    /**
     * Set <p>ID of the visual understanding template</p>
     * @param VLTemplateId <p>ID of the visual understanding template</p>
     */
    public void setVLTemplateId(String VLTemplateId) {
        this.VLTemplateId = VLTemplateId;
    }

    /**
     * Get <p>Callback notification configuration</p> 
     * @return Callback <p>Callback notification configuration</p>
     */
    public CallbackURL getCallback() {
        return this.Callback;
    }

    /**
     * Set <p>Callback notification configuration</p>
     * @param Callback <p>Callback notification configuration</p>
     */
    public void setCallback(CallbackURL Callback) {
        this.Callback = Callback;
    }

    /**
     * Get <p>File expiration time (seconds)</p> 
     * @return FileExpires <p>File expiration time (seconds)</p>
     */
    public Long getFileExpires() {
        return this.FileExpires;
    }

    /**
     * Set <p>File expiration time (seconds)</p>
     * @param FileExpires <p>File expiration time (seconds)</p>
     */
    public void setFileExpires(Long FileExpires) {
        this.FileExpires = FileExpires;
    }

    /**
     * Get <p>Number of channels included in the plan</p> 
     * @return ChannelCount <p>Number of channels included in the plan</p>
     */
    public Long getChannelCount() {
        return this.ChannelCount;
    }

    /**
     * Set <p>Number of channels included in the plan</p>
     * @param ChannelCount <p>Number of channels included in the plan</p>
     */
    public void setChannelCount(Long ChannelCount) {
        this.ChannelCount = ChannelCount;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedAt <p>Creation time.</p>
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedAt <p>Creation time.</p>
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>Last update time</p> 
     * @return UpdatedAt <p>Last update time</p>
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>Last update time</p>
     * @param UpdatedAt <p>Last update time</p>
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public VLPlanInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VLPlanInfo(VLPlanInfo source) {
        if (source.VLPlanId != null) {
            this.VLPlanId = new String(source.VLPlanId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Describe != null) {
            this.Describe = new String(source.Describe);
        }
        if (source.VLTemplateId != null) {
            this.VLTemplateId = new String(source.VLTemplateId);
        }
        if (source.Callback != null) {
            this.Callback = new CallbackURL(source.Callback);
        }
        if (source.FileExpires != null) {
            this.FileExpires = new Long(source.FileExpires);
        }
        if (source.ChannelCount != null) {
            this.ChannelCount = new Long(source.ChannelCount);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VLPlanId", this.VLPlanId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Describe", this.Describe);
        this.setParamSimple(map, prefix + "VLTemplateId", this.VLTemplateId);
        this.setParamObj(map, prefix + "Callback.", this.Callback);
        this.setParamSimple(map, prefix + "FileExpires", this.FileExpires);
        this.setParamSimple(map, prefix + "ChannelCount", this.ChannelCount);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}


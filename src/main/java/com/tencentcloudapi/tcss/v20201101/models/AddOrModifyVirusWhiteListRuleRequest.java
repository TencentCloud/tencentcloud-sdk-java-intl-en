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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddOrModifyVirusWhiteListRuleRequest extends AbstractModel {

    /**
    * <p>MD5 list.</p>
    */
    @SerializedName("Md5List")
    @Expose
    private String [] Md5List;

    /**
    * <p>Scope: 1 indicates all images, and 0 indicates selected images.</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>Rule ID. Presence of rule ID values indicates modification, and absence of rule ID values indicates addition.</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>Image ID list, maximum 1,000. Required when Scope is 0 (selected images).</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * <p>Rule remarks, with a maximum of 256 characters.</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>Event ID.</p>
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
     * Get <p>MD5 list.</p> 
     * @return Md5List <p>MD5 list.</p>
     */
    public String [] getMd5List() {
        return this.Md5List;
    }

    /**
     * Set <p>MD5 list.</p>
     * @param Md5List <p>MD5 list.</p>
     */
    public void setMd5List(String [] Md5List) {
        this.Md5List = Md5List;
    }

    /**
     * Get <p>Scope: 1 indicates all images, and 0 indicates selected images.</p> 
     * @return Scope <p>Scope: 1 indicates all images, and 0 indicates selected images.</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>Scope: 1 indicates all images, and 0 indicates selected images.</p>
     * @param Scope <p>Scope: 1 indicates all images, and 0 indicates selected images.</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>Rule ID. Presence of rule ID values indicates modification, and absence of rule ID values indicates addition.</p> 
     * @return Id <p>Rule ID. Presence of rule ID values indicates modification, and absence of rule ID values indicates addition.</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>Rule ID. Presence of rule ID values indicates modification, and absence of rule ID values indicates addition.</p>
     * @param Id <p>Rule ID. Presence of rule ID values indicates modification, and absence of rule ID values indicates addition.</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Image ID list, maximum 1,000. Required when Scope is 0 (selected images).</p> 
     * @return ImageIds <p>Image ID list, maximum 1,000. Required when Scope is 0 (selected images).</p>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>Image ID list, maximum 1,000. Required when Scope is 0 (selected images).</p>
     * @param ImageIds <p>Image ID list, maximum 1,000. Required when Scope is 0 (selected images).</p>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>Rule remarks, with a maximum of 256 characters.</p> 
     * @return Remark <p>Rule remarks, with a maximum of 256 characters.</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>Rule remarks, with a maximum of 256 characters.</p>
     * @param Remark <p>Rule remarks, with a maximum of 256 characters.</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>Event ID.</p> 
     * @return EventId <p>Event ID.</p>
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set <p>Event ID.</p>
     * @param EventId <p>Event ID.</p>
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    public AddOrModifyVirusWhiteListRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddOrModifyVirusWhiteListRuleRequest(AddOrModifyVirusWhiteListRuleRequest source) {
        if (source.Md5List != null) {
            this.Md5List = new String[source.Md5List.length];
            for (int i = 0; i < source.Md5List.length; i++) {
                this.Md5List[i] = new String(source.Md5List[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Md5List.", this.Md5List);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "EventId", this.EventId);

    }
}


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

public class UpdateMachineTagsRequest extends AbstractModel {

    /**
    * Machine QUUID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Tag ID. This operation will overwrite the existing Tag list.
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
    * Server region. For example, ap-guangzhou.
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
    * Server type (CVM|BM|ECM|LH|Other)
    */
    @SerializedName("MachineArea")
    @Expose
    private String MachineArea;

    /**
     * Get Machine QUUID 
     * @return Quuid Machine QUUID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Machine QUUID
     * @param Quuid Machine QUUID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Tag ID. This operation will overwrite the existing Tag list. 
     * @return TagIds Tag ID. This operation will overwrite the existing Tag list.
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set Tag ID. This operation will overwrite the existing Tag list.
     * @param TagIds Tag ID. This operation will overwrite the existing Tag list.
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get Server region. For example, ap-guangzhou. 
     * @return MachineRegion Server region. For example, ap-guangzhou.
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Server region. For example, ap-guangzhou.
     * @param MachineRegion Server region. For example, ap-guangzhou.
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    /**
     * Get Server type (CVM|BM|ECM|LH|Other) 
     * @return MachineArea Server type (CVM|BM|ECM|LH|Other)
     */
    public String getMachineArea() {
        return this.MachineArea;
    }

    /**
     * Set Server type (CVM|BM|ECM|LH|Other)
     * @param MachineArea Server type (CVM|BM|ECM|LH|Other)
     */
    public void setMachineArea(String MachineArea) {
        this.MachineArea = MachineArea;
    }

    public UpdateMachineTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateMachineTagsRequest(UpdateMachineTagsRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
        if (source.MachineArea != null) {
            this.MachineArea = new String(source.MachineArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);
        this.setParamSimple(map, prefix + "MachineArea", this.MachineArea);

    }
}


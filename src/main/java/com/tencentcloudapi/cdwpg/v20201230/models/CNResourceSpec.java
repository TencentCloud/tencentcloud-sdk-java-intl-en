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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CNResourceSpec extends AbstractModel {

    /**
    * Node type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Model.


    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Number of nodes.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Disk information.
    */
    @SerializedName("DiskSpec")
    @Expose
    private CBSSpec DiskSpec;

    /**
     * Get Node type. 
     * @return Type Node type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Node type.
     * @param Type Node type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Model.

 
     * @return SpecName Model.


     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Model.


     * @param SpecName Model.


     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Number of nodes. 
     * @return Count Number of nodes.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of nodes.
     * @param Count Number of nodes.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Disk information. 
     * @return DiskSpec Disk information.
     */
    public CBSSpec getDiskSpec() {
        return this.DiskSpec;
    }

    /**
     * Set Disk information.
     * @param DiskSpec Disk information.
     */
    public void setDiskSpec(CBSSpec DiskSpec) {
        this.DiskSpec = DiskSpec;
    }

    public CNResourceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CNResourceSpec(CNResourceSpec source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSpec != null) {
            this.DiskSpec = new CBSSpec(source.DiskSpec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamObj(map, prefix + "DiskSpec.", this.DiskSpec);

    }
}


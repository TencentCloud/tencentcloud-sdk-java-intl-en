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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LocalDiskType extends AbstractModel{

    /**
    * Type of a local disk.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Attributes of a local disk.
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * Minimum size of a local disk.
    */
    @SerializedName("MinSize")
    @Expose
    private Long MinSize;

    /**
    * Maximum size of a local disk.
    */
    @SerializedName("MaxSize")
    @Expose
    private Long MaxSize;

    /**
    * Whether a local disk is required during purchase. Valid values:<br><li>REQUIRED: required<br><li>OPTIONAL: optional
    */
    @SerializedName("Required")
    @Expose
    private String Required;

    /**
     * Get Type of a local disk. 
     * @return Type Type of a local disk.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of a local disk.
     * @param Type Type of a local disk.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Attributes of a local disk. 
     * @return PartitionType Attributes of a local disk.
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set Attributes of a local disk.
     * @param PartitionType Attributes of a local disk.
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get Minimum size of a local disk. 
     * @return MinSize Minimum size of a local disk.
     */
    public Long getMinSize() {
        return this.MinSize;
    }

    /**
     * Set Minimum size of a local disk.
     * @param MinSize Minimum size of a local disk.
     */
    public void setMinSize(Long MinSize) {
        this.MinSize = MinSize;
    }

    /**
     * Get Maximum size of a local disk. 
     * @return MaxSize Maximum size of a local disk.
     */
    public Long getMaxSize() {
        return this.MaxSize;
    }

    /**
     * Set Maximum size of a local disk.
     * @param MaxSize Maximum size of a local disk.
     */
    public void setMaxSize(Long MaxSize) {
        this.MaxSize = MaxSize;
    }

    /**
     * Get Whether a local disk is required during purchase. Valid values:<br><li>REQUIRED: required<br><li>OPTIONAL: optional 
     * @return Required Whether a local disk is required during purchase. Valid values:<br><li>REQUIRED: required<br><li>OPTIONAL: optional
     */
    public String getRequired() {
        return this.Required;
    }

    /**
     * Set Whether a local disk is required during purchase. Valid values:<br><li>REQUIRED: required<br><li>OPTIONAL: optional
     * @param Required Whether a local disk is required during purchase. Valid values:<br><li>REQUIRED: required<br><li>OPTIONAL: optional
     */
    public void setRequired(String Required) {
        this.Required = Required;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "MinSize", this.MinSize);
        this.setParamSimple(map, prefix + "MaxSize", this.MaxSize);
        this.setParamSimple(map, prefix + "Required", this.Required);

    }
}


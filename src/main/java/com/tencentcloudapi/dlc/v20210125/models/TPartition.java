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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TPartition extends AbstractModel {

    /**
    * The field name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The field type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The field description.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * The partition type.
    */
    @SerializedName("PartitionType")
    @Expose
    private String PartitionType;

    /**
    * The partition format.
    */
    @SerializedName("PartitionFormat")
    @Expose
    private String PartitionFormat;

    /**
    * The separator count of the partition conversion policy.
    */
    @SerializedName("PartitionDot")
    @Expose
    private Long PartitionDot;

    /**
    * The partition conversion policy.
    */
    @SerializedName("Transform")
    @Expose
    private String Transform;

    /**
    * The policy parameters.
    */
    @SerializedName("TransformArgs")
    @Expose
    private String [] TransformArgs;

    /**
     * Get The field name. 
     * @return Name The field name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The field name.
     * @param Name The field name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The field type. 
     * @return Type The field type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The field type.
     * @param Type The field type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The field description. 
     * @return Comment The field description.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set The field description.
     * @param Comment The field description.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get The partition type. 
     * @return PartitionType The partition type.
     */
    public String getPartitionType() {
        return this.PartitionType;
    }

    /**
     * Set The partition type.
     * @param PartitionType The partition type.
     */
    public void setPartitionType(String PartitionType) {
        this.PartitionType = PartitionType;
    }

    /**
     * Get The partition format. 
     * @return PartitionFormat The partition format.
     */
    public String getPartitionFormat() {
        return this.PartitionFormat;
    }

    /**
     * Set The partition format.
     * @param PartitionFormat The partition format.
     */
    public void setPartitionFormat(String PartitionFormat) {
        this.PartitionFormat = PartitionFormat;
    }

    /**
     * Get The separator count of the partition conversion policy. 
     * @return PartitionDot The separator count of the partition conversion policy.
     */
    public Long getPartitionDot() {
        return this.PartitionDot;
    }

    /**
     * Set The separator count of the partition conversion policy.
     * @param PartitionDot The separator count of the partition conversion policy.
     */
    public void setPartitionDot(Long PartitionDot) {
        this.PartitionDot = PartitionDot;
    }

    /**
     * Get The partition conversion policy. 
     * @return Transform The partition conversion policy.
     */
    public String getTransform() {
        return this.Transform;
    }

    /**
     * Set The partition conversion policy.
     * @param Transform The partition conversion policy.
     */
    public void setTransform(String Transform) {
        this.Transform = Transform;
    }

    /**
     * Get The policy parameters. 
     * @return TransformArgs The policy parameters.
     */
    public String [] getTransformArgs() {
        return this.TransformArgs;
    }

    /**
     * Set The policy parameters.
     * @param TransformArgs The policy parameters.
     */
    public void setTransformArgs(String [] TransformArgs) {
        this.TransformArgs = TransformArgs;
    }

    public TPartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TPartition(TPartition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PartitionType != null) {
            this.PartitionType = new String(source.PartitionType);
        }
        if (source.PartitionFormat != null) {
            this.PartitionFormat = new String(source.PartitionFormat);
        }
        if (source.PartitionDot != null) {
            this.PartitionDot = new Long(source.PartitionDot);
        }
        if (source.Transform != null) {
            this.Transform = new String(source.Transform);
        }
        if (source.TransformArgs != null) {
            this.TransformArgs = new String[source.TransformArgs.length];
            for (int i = 0; i < source.TransformArgs.length; i++) {
                this.TransformArgs[i] = new String(source.TransformArgs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PartitionType", this.PartitionType);
        this.setParamSimple(map, prefix + "PartitionFormat", this.PartitionFormat);
        this.setParamSimple(map, prefix + "PartitionDot", this.PartitionDot);
        this.setParamSimple(map, prefix + "Transform", this.Transform);
        this.setParamArraySimple(map, prefix + "TransformArgs.", this.TransformArgs);

    }
}


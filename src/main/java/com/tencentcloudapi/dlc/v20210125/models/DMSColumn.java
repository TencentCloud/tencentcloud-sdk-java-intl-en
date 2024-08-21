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

public class DMSColumn extends AbstractModel {

    /**
    * Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Type
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Sort
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Position")
    @Expose
    private Long Position;

    /**
    * Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Params")
    @Expose
    private KVPair [] Params;

    /**
    * Business parameters
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BizParams")
    @Expose
    private KVPair [] BizParams;

    /**
    * Whether partitioned
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsPartition")
    @Expose
    private Boolean IsPartition;

    /**
     * Get Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Type
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Type
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Sort
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Position Sort
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPosition() {
        return this.Position;
    }

    /**
     * Set Sort
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Position Sort
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPosition(Long Position) {
        this.Position = Position;
    }

    /**
     * Get Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Params Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KVPair [] getParams() {
        return this.Params;
    }

    /**
     * Set Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Params Additional Parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setParams(KVPair [] Params) {
        this.Params = Params;
    }

    /**
     * Get Business parameters
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BizParams Business parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public KVPair [] getBizParams() {
        return this.BizParams;
    }

    /**
     * Set Business parameters
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BizParams Business parameters
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBizParams(KVPair [] BizParams) {
        this.BizParams = BizParams;
    }

    /**
     * Get Whether partitioned
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IsPartition Whether partitioned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getIsPartition() {
        return this.IsPartition;
    }

    /**
     * Set Whether partitioned
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IsPartition Whether partitioned
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIsPartition(Boolean IsPartition) {
        this.IsPartition = IsPartition;
    }

    public DMSColumn() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DMSColumn(DMSColumn source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Position != null) {
            this.Position = new Long(source.Position);
        }
        if (source.Params != null) {
            this.Params = new KVPair[source.Params.length];
            for (int i = 0; i < source.Params.length; i++) {
                this.Params[i] = new KVPair(source.Params[i]);
            }
        }
        if (source.BizParams != null) {
            this.BizParams = new KVPair[source.BizParams.length];
            for (int i = 0; i < source.BizParams.length; i++) {
                this.BizParams[i] = new KVPair(source.BizParams[i]);
            }
        }
        if (source.IsPartition != null) {
            this.IsPartition = new Boolean(source.IsPartition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Position", this.Position);
        this.setParamArrayObj(map, prefix + "Params.", this.Params);
        this.setParamArrayObj(map, prefix + "BizParams.", this.BizParams);
        this.setParamSimple(map, prefix + "IsPartition", this.IsPartition);

    }
}


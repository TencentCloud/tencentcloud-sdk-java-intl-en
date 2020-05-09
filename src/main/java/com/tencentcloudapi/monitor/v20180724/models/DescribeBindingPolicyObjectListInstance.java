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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBindingPolicyObjectListInstance extends AbstractModel{

    /**
    * Unique ID of the object.
    */
    @SerializedName("UniqueId")
    @Expose
    private String UniqueId;

    /**
    * Dimension set of an object instance, which is a jsonObj string.
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * Whether the object is shielded. The value 0 indicates that the object is not shielded. The value 1 indicates that the object is shielded.
    */
    @SerializedName("IsShielded")
    @Expose
    private Long IsShielded;

    /**
    * Region where the object resides.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get Unique ID of the object. 
     * @return UniqueId Unique ID of the object.
     */
    public String getUniqueId() {
        return this.UniqueId;
    }

    /**
     * Set Unique ID of the object.
     * @param UniqueId Unique ID of the object.
     */
    public void setUniqueId(String UniqueId) {
        this.UniqueId = UniqueId;
    }

    /**
     * Get Dimension set of an object instance, which is a jsonObj string. 
     * @return Dimensions Dimension set of an object instance, which is a jsonObj string.
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Dimension set of an object instance, which is a jsonObj string.
     * @param Dimensions Dimension set of an object instance, which is a jsonObj string.
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Whether the object is shielded. The value 0 indicates that the object is not shielded. The value 1 indicates that the object is shielded. 
     * @return IsShielded Whether the object is shielded. The value 0 indicates that the object is not shielded. The value 1 indicates that the object is shielded.
     */
    public Long getIsShielded() {
        return this.IsShielded;
    }

    /**
     * Set Whether the object is shielded. The value 0 indicates that the object is not shielded. The value 1 indicates that the object is shielded.
     * @param IsShielded Whether the object is shielded. The value 0 indicates that the object is not shielded. The value 1 indicates that the object is shielded.
     */
    public void setIsShielded(Long IsShielded) {
        this.IsShielded = IsShielded;
    }

    /**
     * Get Region where the object resides. 
     * @return Region Region where the object resides.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region where the object resides.
     * @param Region Region where the object resides.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UniqueId", this.UniqueId);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamSimple(map, prefix + "IsShielded", this.IsShielded);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}


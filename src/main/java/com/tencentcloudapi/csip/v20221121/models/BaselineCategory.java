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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BaselineCategory extends AbstractModel {

    /**
    * <p>Baseline classification ID.</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Baseline classification name (Chinese).</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Baseline category description (Chinese).</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Detect the asset major category and distinguish between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
     * Get <p>Baseline classification ID.</p> 
     * @return ID <p>Baseline classification ID.</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Baseline classification ID.</p>
     * @param ID <p>Baseline classification ID.</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Baseline classification name (Chinese).</p> 
     * @return Name <p>Baseline classification name (Chinese).</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Baseline classification name (Chinese).</p>
     * @param Name <p>Baseline classification name (Chinese).</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Baseline category description (Chinese).</p> 
     * @return Description <p>Baseline category description (Chinese).</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Baseline category description (Chinese).</p>
     * @param Description <p>Baseline category description (Chinese).</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Detect the asset major category and distinguish between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul> 
     * @return CheckAssetType <p>Detect the asset major category and distinguish between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>Detect the asset major category and distinguish between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     * @param CheckAssetType <p>Detect the asset major category and distinguish between host baseline and container cluster baseline. Parameter Value:</p><ul><li>HOST: Host</li><li>CLUSTER: Container cluster</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    public BaselineCategory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineCategory(BaselineCategory source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);

    }
}


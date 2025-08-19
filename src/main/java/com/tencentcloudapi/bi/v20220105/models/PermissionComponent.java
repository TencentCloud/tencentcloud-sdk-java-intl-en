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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PermissionComponent extends AbstractModel {

    /**
    * Permission value.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ModuleId")
    @Expose
    private String ModuleId;

    /**
    * Visible/Available.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IncludeType")
    @Expose
    private String IncludeType;

    /**
    * Target upgrade version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("UpgradeVersionType")
    @Expose
    private String UpgradeVersionType;

    /**
    * Supplemental information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tips")
    @Expose
    private String Tips;

    /**
    * Key for supplementary information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TipsKey")
    @Expose
    private String TipsKey;

    /**
     * Get Permission value.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ModuleId Permission value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getModuleId() {
        return this.ModuleId;
    }

    /**
     * Set Permission value.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ModuleId Permission value.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setModuleId(String ModuleId) {
        this.ModuleId = ModuleId;
    }

    /**
     * Get Visible/Available.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IncludeType Visible/Available.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIncludeType() {
        return this.IncludeType;
    }

    /**
     * Set Visible/Available.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IncludeType Visible/Available.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIncludeType(String IncludeType) {
        this.IncludeType = IncludeType;
    }

    /**
     * Get Target upgrade version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return UpgradeVersionType Target upgrade version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUpgradeVersionType() {
        return this.UpgradeVersionType;
    }

    /**
     * Set Target upgrade version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param UpgradeVersionType Target upgrade version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUpgradeVersionType(String UpgradeVersionType) {
        this.UpgradeVersionType = UpgradeVersionType;
    }

    /**
     * Get Supplemental information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tips Supplemental information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTips() {
        return this.Tips;
    }

    /**
     * Set Supplemental information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tips Supplemental information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTips(String Tips) {
        this.Tips = Tips;
    }

    /**
     * Get Key for supplementary information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TipsKey Key for supplementary information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTipsKey() {
        return this.TipsKey;
    }

    /**
     * Set Key for supplementary information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TipsKey Key for supplementary information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTipsKey(String TipsKey) {
        this.TipsKey = TipsKey;
    }

    public PermissionComponent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PermissionComponent(PermissionComponent source) {
        if (source.ModuleId != null) {
            this.ModuleId = new String(source.ModuleId);
        }
        if (source.IncludeType != null) {
            this.IncludeType = new String(source.IncludeType);
        }
        if (source.UpgradeVersionType != null) {
            this.UpgradeVersionType = new String(source.UpgradeVersionType);
        }
        if (source.Tips != null) {
            this.Tips = new String(source.Tips);
        }
        if (source.TipsKey != null) {
            this.TipsKey = new String(source.TipsKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModuleId", this.ModuleId);
        this.setParamSimple(map, prefix + "IncludeType", this.IncludeType);
        this.setParamSimple(map, prefix + "UpgradeVersionType", this.UpgradeVersionType);
        this.setParamSimple(map, prefix + "Tips", this.Tips);
        this.setParamSimple(map, prefix + "TipsKey", this.TipsKey);

    }
}


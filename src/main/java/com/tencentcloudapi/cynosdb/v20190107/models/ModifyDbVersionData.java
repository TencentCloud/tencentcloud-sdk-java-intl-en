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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDbVersionData extends AbstractModel {

    /**
    * 
    */
    @SerializedName("OldVersion")
    @Expose
    private String OldVersion;

    /**
    * 
    */
    @SerializedName("NewVersion")
    @Expose
    private String NewVersion;

    /**
    * 
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
     * Get  
     * @return OldVersion 
     */
    public String getOldVersion() {
        return this.OldVersion;
    }

    /**
     * Set 
     * @param OldVersion 
     */
    public void setOldVersion(String OldVersion) {
        this.OldVersion = OldVersion;
    }

    /**
     * Get  
     * @return NewVersion 
     */
    public String getNewVersion() {
        return this.NewVersion;
    }

    /**
     * Set 
     * @param NewVersion 
     */
    public void setNewVersion(String NewVersion) {
        this.NewVersion = NewVersion;
    }

    /**
     * Get  
     * @return UpgradeType 
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 
     * @param UpgradeType 
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    public ModifyDbVersionData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDbVersionData(ModifyDbVersionData source) {
        if (source.OldVersion != null) {
            this.OldVersion = new String(source.OldVersion);
        }
        if (source.NewVersion != null) {
            this.NewVersion = new String(source.NewVersion);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldVersion", this.OldVersion);
        this.setParamSimple(map, prefix + "NewVersion", this.NewVersion);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);

    }
}


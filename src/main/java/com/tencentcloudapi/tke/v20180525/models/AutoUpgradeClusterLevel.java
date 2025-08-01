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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AutoUpgradeClusterLevel extends AbstractModel {

    /**
    * Whether to enable Auto Cluster Upgrade
    */
    @SerializedName("IsAutoUpgrade")
    @Expose
    private Boolean IsAutoUpgrade;

    /**
     * Get Whether to enable Auto Cluster Upgrade 
     * @return IsAutoUpgrade Whether to enable Auto Cluster Upgrade
     */
    public Boolean getIsAutoUpgrade() {
        return this.IsAutoUpgrade;
    }

    /**
     * Set Whether to enable Auto Cluster Upgrade
     * @param IsAutoUpgrade Whether to enable Auto Cluster Upgrade
     */
    public void setIsAutoUpgrade(Boolean IsAutoUpgrade) {
        this.IsAutoUpgrade = IsAutoUpgrade;
    }

    public AutoUpgradeClusterLevel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoUpgradeClusterLevel(AutoUpgradeClusterLevel source) {
        if (source.IsAutoUpgrade != null) {
            this.IsAutoUpgrade = new Boolean(source.IsAutoUpgrade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsAutoUpgrade", this.IsAutoUpgrade);

    }
}


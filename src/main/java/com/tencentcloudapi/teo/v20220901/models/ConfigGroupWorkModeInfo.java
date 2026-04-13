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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigGroupWorkModeInfo extends AbstractModel {

    /**
    * Configuration group type. Options are as follows:<li>l7_acceleration: layer-7 acceleration configuration group;</li><li>edge_functions: edge function configuration group.</li><li>web_security: web protection configuration group.</li>
    */
    @SerializedName("ConfigGroupType")
    @Expose
    private String ConfigGroupType;

    /**
    * Working mode. options are as follows: <li>immediate_effect: immediate effect mode;</li><li>version_control: version management mode.</li>.
    */
    @SerializedName("WorkMode")
    @Expose
    private String WorkMode;

    /**
     * Get Configuration group type. Options are as follows:<li>l7_acceleration: layer-7 acceleration configuration group;</li><li>edge_functions: edge function configuration group.</li><li>web_security: web protection configuration group.</li> 
     * @return ConfigGroupType Configuration group type. Options are as follows:<li>l7_acceleration: layer-7 acceleration configuration group;</li><li>edge_functions: edge function configuration group.</li><li>web_security: web protection configuration group.</li>
     */
    public String getConfigGroupType() {
        return this.ConfigGroupType;
    }

    /**
     * Set Configuration group type. Options are as follows:<li>l7_acceleration: layer-7 acceleration configuration group;</li><li>edge_functions: edge function configuration group.</li><li>web_security: web protection configuration group.</li>
     * @param ConfigGroupType Configuration group type. Options are as follows:<li>l7_acceleration: layer-7 acceleration configuration group;</li><li>edge_functions: edge function configuration group.</li><li>web_security: web protection configuration group.</li>
     */
    public void setConfigGroupType(String ConfigGroupType) {
        this.ConfigGroupType = ConfigGroupType;
    }

    /**
     * Get Working mode. options are as follows: <li>immediate_effect: immediate effect mode;</li><li>version_control: version management mode.</li>. 
     * @return WorkMode Working mode. options are as follows: <li>immediate_effect: immediate effect mode;</li><li>version_control: version management mode.</li>.
     */
    public String getWorkMode() {
        return this.WorkMode;
    }

    /**
     * Set Working mode. options are as follows: <li>immediate_effect: immediate effect mode;</li><li>version_control: version management mode.</li>.
     * @param WorkMode Working mode. options are as follows: <li>immediate_effect: immediate effect mode;</li><li>version_control: version management mode.</li>.
     */
    public void setWorkMode(String WorkMode) {
        this.WorkMode = WorkMode;
    }

    public ConfigGroupWorkModeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigGroupWorkModeInfo(ConfigGroupWorkModeInfo source) {
        if (source.ConfigGroupType != null) {
            this.ConfigGroupType = new String(source.ConfigGroupType);
        }
        if (source.WorkMode != null) {
            this.WorkMode = new String(source.WorkMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigGroupType", this.ConfigGroupType);
        this.setParamSimple(map, prefix + "WorkMode", this.WorkMode);

    }
}


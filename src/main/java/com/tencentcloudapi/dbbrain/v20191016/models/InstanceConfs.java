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
package com.tencentcloudapi.dbbrain.v20191016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceConfs extends AbstractModel{

    /**
    * Whether to enable database inspection. Valid values: Yes/No.
    */
    @SerializedName("DailyInspection")
    @Expose
    private String DailyInspection;

    /**
    * Whether to enable instance overview. Valid values: Yes/No.
    */
    @SerializedName("OverviewDisplay")
    @Expose
    private String OverviewDisplay;

    /**
     * Get Whether to enable database inspection. Valid values: Yes/No. 
     * @return DailyInspection Whether to enable database inspection. Valid values: Yes/No.
     */
    public String getDailyInspection() {
        return this.DailyInspection;
    }

    /**
     * Set Whether to enable database inspection. Valid values: Yes/No.
     * @param DailyInspection Whether to enable database inspection. Valid values: Yes/No.
     */
    public void setDailyInspection(String DailyInspection) {
        this.DailyInspection = DailyInspection;
    }

    /**
     * Get Whether to enable instance overview. Valid values: Yes/No. 
     * @return OverviewDisplay Whether to enable instance overview. Valid values: Yes/No.
     */
    public String getOverviewDisplay() {
        return this.OverviewDisplay;
    }

    /**
     * Set Whether to enable instance overview. Valid values: Yes/No.
     * @param OverviewDisplay Whether to enable instance overview. Valid values: Yes/No.
     */
    public void setOverviewDisplay(String OverviewDisplay) {
        this.OverviewDisplay = OverviewDisplay;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DailyInspection", this.DailyInspection);
        this.setParamSimple(map, prefix + "OverviewDisplay", this.OverviewDisplay);

    }
}


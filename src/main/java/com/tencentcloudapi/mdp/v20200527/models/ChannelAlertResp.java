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
package com.tencentcloudapi.mdp.v20200527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelAlertResp extends AbstractModel {

    /**
    * Program alarm aggregation information.
    */
    @SerializedName("ProgramAlertCounts")
    @Expose
    private ProgramAlertCounts [] ProgramAlertCounts;

    /**
    * Program alarm details.
    */
    @SerializedName("ProgramAlertInfos")
    @Expose
    private ProgramAlertInfos [] ProgramAlertInfos;

    /**
     * Get Program alarm aggregation information. 
     * @return ProgramAlertCounts Program alarm aggregation information.
     */
    public ProgramAlertCounts [] getProgramAlertCounts() {
        return this.ProgramAlertCounts;
    }

    /**
     * Set Program alarm aggregation information.
     * @param ProgramAlertCounts Program alarm aggregation information.
     */
    public void setProgramAlertCounts(ProgramAlertCounts [] ProgramAlertCounts) {
        this.ProgramAlertCounts = ProgramAlertCounts;
    }

    /**
     * Get Program alarm details. 
     * @return ProgramAlertInfos Program alarm details.
     */
    public ProgramAlertInfos [] getProgramAlertInfos() {
        return this.ProgramAlertInfos;
    }

    /**
     * Set Program alarm details.
     * @param ProgramAlertInfos Program alarm details.
     */
    public void setProgramAlertInfos(ProgramAlertInfos [] ProgramAlertInfos) {
        this.ProgramAlertInfos = ProgramAlertInfos;
    }

    public ChannelAlertResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelAlertResp(ChannelAlertResp source) {
        if (source.ProgramAlertCounts != null) {
            this.ProgramAlertCounts = new ProgramAlertCounts[source.ProgramAlertCounts.length];
            for (int i = 0; i < source.ProgramAlertCounts.length; i++) {
                this.ProgramAlertCounts[i] = new ProgramAlertCounts(source.ProgramAlertCounts[i]);
            }
        }
        if (source.ProgramAlertInfos != null) {
            this.ProgramAlertInfos = new ProgramAlertInfos[source.ProgramAlertInfos.length];
            for (int i = 0; i < source.ProgramAlertInfos.length; i++) {
                this.ProgramAlertInfos[i] = new ProgramAlertInfos(source.ProgramAlertInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ProgramAlertCounts.", this.ProgramAlertCounts);
        this.setParamArrayObj(map, prefix + "ProgramAlertInfos.", this.ProgramAlertInfos);

    }
}


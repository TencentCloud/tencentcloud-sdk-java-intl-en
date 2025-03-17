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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScenarioWithJobs extends AbstractModel {

    /**
    * Scenario.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Scenario")
    @Expose
    private Scenario Scenario;

    /**
    * Job list.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("Jobs")
    @Expose
    private Job [] Jobs;

    /**
     * Get Scenario.

Note: This field may return null, indicating that no valid value is found. 
     * @return Scenario Scenario.

Note: This field may return null, indicating that no valid value is found.
     */
    public Scenario getScenario() {
        return this.Scenario;
    }

    /**
     * Set Scenario.

Note: This field may return null, indicating that no valid value is found.
     * @param Scenario Scenario.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setScenario(Scenario Scenario) {
        this.Scenario = Scenario;
    }

    /**
     * Get Job list.

Note: This field may return null, indicating that no valid value is found. 
     * @return Jobs Job list.

Note: This field may return null, indicating that no valid value is found.
     */
    public Job [] getJobs() {
        return this.Jobs;
    }

    /**
     * Set Job list.

Note: This field may return null, indicating that no valid value is found.
     * @param Jobs Job list.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setJobs(Job [] Jobs) {
        this.Jobs = Jobs;
    }

    public ScenarioWithJobs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScenarioWithJobs(ScenarioWithJobs source) {
        if (source.Scenario != null) {
            this.Scenario = new Scenario(source.Scenario);
        }
        if (source.Jobs != null) {
            this.Jobs = new Job[source.Jobs.length];
            for (int i = 0; i < source.Jobs.length; i++) {
                this.Jobs[i] = new Job(source.Jobs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Scenario.", this.Scenario);
        this.setParamArrayObj(map, prefix + "Jobs.", this.Jobs);

    }
}


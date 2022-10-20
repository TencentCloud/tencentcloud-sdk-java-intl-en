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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpeedTestingInfo extends AbstractModel{

    /**
    * The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed.</li>
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * ID of the site test task.
    */
    @SerializedName("TestId")
    @Expose
    private String TestId;

    /**
    * The settings of the site test task.
    */
    @SerializedName("SpeedTestingConfig")
    @Expose
    private SpeedTestingConfig SpeedTestingConfig;

    /**
    * The site test result.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SpeedTestingStatistics")
    @Expose
    private SpeedTestingStatistics SpeedTestingStatistics;

    /**
     * Get The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed.</li> 
     * @return StatusCode The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed.</li>
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed.</li>
     * @param StatusCode The task status. Values:
<li>`200`: The task completed.</li>
<li>`100`: The task is running.</li>
<li>`503`: The task failed.</li>
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get ID of the site test task. 
     * @return TestId ID of the site test task.
     */
    public String getTestId() {
        return this.TestId;
    }

    /**
     * Set ID of the site test task.
     * @param TestId ID of the site test task.
     */
    public void setTestId(String TestId) {
        this.TestId = TestId;
    }

    /**
     * Get The settings of the site test task. 
     * @return SpeedTestingConfig The settings of the site test task.
     */
    public SpeedTestingConfig getSpeedTestingConfig() {
        return this.SpeedTestingConfig;
    }

    /**
     * Set The settings of the site test task.
     * @param SpeedTestingConfig The settings of the site test task.
     */
    public void setSpeedTestingConfig(SpeedTestingConfig SpeedTestingConfig) {
        this.SpeedTestingConfig = SpeedTestingConfig;
    }

    /**
     * Get The site test result.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SpeedTestingStatistics The site test result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public SpeedTestingStatistics getSpeedTestingStatistics() {
        return this.SpeedTestingStatistics;
    }

    /**
     * Set The site test result.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SpeedTestingStatistics The site test result.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSpeedTestingStatistics(SpeedTestingStatistics SpeedTestingStatistics) {
        this.SpeedTestingStatistics = SpeedTestingStatistics;
    }

    public SpeedTestingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpeedTestingInfo(SpeedTestingInfo source) {
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.TestId != null) {
            this.TestId = new String(source.TestId);
        }
        if (source.SpeedTestingConfig != null) {
            this.SpeedTestingConfig = new SpeedTestingConfig(source.SpeedTestingConfig);
        }
        if (source.SpeedTestingStatistics != null) {
            this.SpeedTestingStatistics = new SpeedTestingStatistics(source.SpeedTestingStatistics);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "TestId", this.TestId);
        this.setParamObj(map, prefix + "SpeedTestingConfig.", this.SpeedTestingConfig);
        this.setParamObj(map, prefix + "SpeedTestingStatistics.", this.SpeedTestingStatistics);

    }
}


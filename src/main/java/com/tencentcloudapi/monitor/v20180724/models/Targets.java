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

public class Targets extends AbstractModel{

    /**
    * The total count
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Number of online targets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * Number of offline targets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Down")
    @Expose
    private Long Down;

    /**
    * Number of unknown status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Unknown")
    @Expose
    private Long Unknown;

    /**
     * Get The total count
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Total The total count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set The total count
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Total The total count
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Number of online targets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Up Number of online targets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set Number of online targets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Up Number of online targets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get Number of offline targets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Down Number of offline targets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDown() {
        return this.Down;
    }

    /**
     * Set Number of offline targets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Down Number of offline targets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDown(Long Down) {
        this.Down = Down;
    }

    /**
     * Get Number of unknown status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Unknown Number of unknown status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getUnknown() {
        return this.Unknown;
    }

    /**
     * Set Number of unknown status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Unknown Number of unknown status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUnknown(Long Unknown) {
        this.Unknown = Unknown;
    }

    public Targets() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Targets(Targets source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.Down != null) {
            this.Down = new Long(source.Down);
        }
        if (source.Unknown != null) {
            this.Unknown = new Long(source.Unknown);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "Down", this.Down);
        this.setParamSimple(map, prefix + "Unknown", this.Unknown);

    }
}


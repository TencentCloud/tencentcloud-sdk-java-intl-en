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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SegmentSpecificInfo extends AbstractModel {

    /**
    * Switch for segment duration at startup. Optional values:
on: Turn on the switch
off: Turn off the switch
Default value: off
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Segment duration at startup. Unit: second
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FragmentTime")
    @Expose
    private Long FragmentTime;

    /**
    * Number of effective segments, indicating the first FragmentEndNum segments with FragmentTime. Value range: >=1
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("FragmentEndNum")
    @Expose
    private Long FragmentEndNum;

    /**
     * Get Switch for segment duration at startup. Optional values:
on: Turn on the switch
off: Turn off the switch
Default value: off
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return Switch Switch for segment duration at startup. Optional values:
on: Turn on the switch
off: Turn off the switch
Default value: off
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch for segment duration at startup. Optional values:
on: Turn on the switch
off: Turn off the switch
Default value: off
Note: This field may return null, indicating that no valid value can be obtained.
     * @param Switch Switch for segment duration at startup. Optional values:
on: Turn on the switch
off: Turn off the switch
Default value: off
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Segment duration at startup. Unit: second
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FragmentTime Segment duration at startup. Unit: second
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFragmentTime() {
        return this.FragmentTime;
    }

    /**
     * Set Segment duration at startup. Unit: second
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FragmentTime Segment duration at startup. Unit: second
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFragmentTime(Long FragmentTime) {
        this.FragmentTime = FragmentTime;
    }

    /**
     * Get Number of effective segments, indicating the first FragmentEndNum segments with FragmentTime. Value range: >=1
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return FragmentEndNum Number of effective segments, indicating the first FragmentEndNum segments with FragmentTime. Value range: >=1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public Long getFragmentEndNum() {
        return this.FragmentEndNum;
    }

    /**
     * Set Number of effective segments, indicating the first FragmentEndNum segments with FragmentTime. Value range: >=1
Note: This field may return null, indicating that no valid value can be obtained.
     * @param FragmentEndNum Number of effective segments, indicating the first FragmentEndNum segments with FragmentTime. Value range: >=1
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setFragmentEndNum(Long FragmentEndNum) {
        this.FragmentEndNum = FragmentEndNum;
    }

    public SegmentSpecificInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SegmentSpecificInfo(SegmentSpecificInfo source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FragmentTime != null) {
            this.FragmentTime = new Long(source.FragmentTime);
        }
        if (source.FragmentEndNum != null) {
            this.FragmentEndNum = new Long(source.FragmentEndNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FragmentTime", this.FragmentTime);
        this.setParamSimple(map, prefix + "FragmentEndNum", this.FragmentEndNum);

    }
}


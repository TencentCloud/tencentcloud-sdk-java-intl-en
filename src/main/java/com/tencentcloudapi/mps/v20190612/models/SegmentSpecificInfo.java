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
    * 
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 
    */
    @SerializedName("FragmentTime")
    @Expose
    private Long FragmentTime;

    /**
    * 
    */
    @SerializedName("FragmentEndNum")
    @Expose
    private Long FragmentEndNum;

    /**
     * Get  
     * @return Switch 
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 
     * @param Switch 
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get  
     * @return FragmentTime 
     */
    public Long getFragmentTime() {
        return this.FragmentTime;
    }

    /**
     * Set 
     * @param FragmentTime 
     */
    public void setFragmentTime(Long FragmentTime) {
        this.FragmentTime = FragmentTime;
    }

    /**
     * Get  
     * @return FragmentEndNum 
     */
    public Long getFragmentEndNum() {
        return this.FragmentEndNum;
    }

    /**
     * Set 
     * @param FragmentEndNum 
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


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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimeShiftSettingsInfo extends AbstractModel {

    /**
    * Whether to enable time shifting. Valid values: `OPEN`; `CLOSE`
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Domain name bound for time shifting
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * Allowable time-shift period (s). Value range: [300, 2592000]. Default value: 300Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StartoverWindow")
    @Expose
    private Long StartoverWindow;

    /**
     * Get Whether to enable time shifting. Valid values: `OPEN`; `CLOSE`
Note: This field may return `null`, indicating that no valid value was found. 
     * @return State Whether to enable time shifting. Valid values: `OPEN`; `CLOSE`
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Whether to enable time shifting. Valid values: `OPEN`; `CLOSE`
Note: This field may return `null`, indicating that no valid value was found.
     * @param State Whether to enable time shifting. Valid values: `OPEN`; `CLOSE`
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Domain name bound for time shifting
Note: This field may return `null`, indicating that no valid value was found. 
     * @return PlayDomain Domain name bound for time shifting
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * Set Domain name bound for time shifting
Note: This field may return `null`, indicating that no valid value was found.
     * @param PlayDomain Domain name bound for time shifting
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * Get Allowable time-shift period (s). Value range: [300, 2592000]. Default value: 300Note: This field may return `null`, indicating that no valid value was found. 
     * @return StartoverWindow Allowable time-shift period (s). Value range: [300, 2592000]. Default value: 300Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getStartoverWindow() {
        return this.StartoverWindow;
    }

    /**
     * Set Allowable time-shift period (s). Value range: [300, 2592000]. Default value: 300Note: This field may return `null`, indicating that no valid value was found.
     * @param StartoverWindow Allowable time-shift period (s). Value range: [300, 2592000]. Default value: 300Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStartoverWindow(Long StartoverWindow) {
        this.StartoverWindow = StartoverWindow;
    }

    public TimeShiftSettingsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimeShiftSettingsInfo(TimeShiftSettingsInfo source) {
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.PlayDomain != null) {
            this.PlayDomain = new String(source.PlayDomain);
        }
        if (source.StartoverWindow != null) {
            this.StartoverWindow = new Long(source.StartoverWindow);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StartoverWindow", this.StartoverWindow);

    }
}


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

public class AlarmHierarchicalValue extends AbstractModel{

    /**
    * Threshold for the `Remind` level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remind")
    @Expose
    private String Remind;

    /**
    * Threshold for the `Warn` level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Warn")
    @Expose
    private String Warn;

    /**
    * Threshold for the `Serious` level
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Serious")
    @Expose
    private String Serious;

    /**
     * Get Threshold for the `Remind` level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remind Threshold for the `Remind` level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemind() {
        return this.Remind;
    }

    /**
     * Set Threshold for the `Remind` level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remind Threshold for the `Remind` level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemind(String Remind) {
        this.Remind = Remind;
    }

    /**
     * Get Threshold for the `Warn` level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Warn Threshold for the `Warn` level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getWarn() {
        return this.Warn;
    }

    /**
     * Set Threshold for the `Warn` level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Warn Threshold for the `Warn` level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWarn(String Warn) {
        this.Warn = Warn;
    }

    /**
     * Get Threshold for the `Serious` level
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Serious Threshold for the `Serious` level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSerious() {
        return this.Serious;
    }

    /**
     * Set Threshold for the `Serious` level
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Serious Threshold for the `Serious` level
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSerious(String Serious) {
        this.Serious = Serious;
    }

    public AlarmHierarchicalValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmHierarchicalValue(AlarmHierarchicalValue source) {
        if (source.Remind != null) {
            this.Remind = new String(source.Remind);
        }
        if (source.Warn != null) {
            this.Warn = new String(source.Warn);
        }
        if (source.Serious != null) {
            this.Serious = new String(source.Serious);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Remind", this.Remind);
        this.setParamSimple(map, prefix + "Warn", this.Warn);
        this.setParamSimple(map, prefix + "Serious", this.Serious);

    }
}


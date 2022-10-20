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

public class WafGroupInfo extends AbstractModel{

    /**
    * List of managed rule groups.
    */
    @SerializedName("WafGroupDetails")
    @Expose
    private WafGroupDetail [] WafGroupDetails;

    /**
    * The level of the managed rule group
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * Reserved field.
    */
    @SerializedName("Act")
    @Expose
    private String Act;

    /**
    * The mode. Values:
<li>`block`: Block</li>
<li>`observe`: Observer</li>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
     * Get List of managed rule groups. 
     * @return WafGroupDetails List of managed rule groups.
     */
    public WafGroupDetail [] getWafGroupDetails() {
        return this.WafGroupDetails;
    }

    /**
     * Set List of managed rule groups.
     * @param WafGroupDetails List of managed rule groups.
     */
    public void setWafGroupDetails(WafGroupDetail [] WafGroupDetails) {
        this.WafGroupDetails = WafGroupDetails;
    }

    /**
     * Get The level of the managed rule group
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li> 
     * @return Level The level of the managed rule group
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set The level of the managed rule group
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
     * @param Level The level of the managed rule group
<li>`loose`: Loose</li>
<li>`normal`: Moderate</li>
<li>`strict`: Strict</li>
<li>`stricter`: Super strict</li>
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get Reserved field. 
     * @return Act Reserved field.
     */
    public String getAct() {
        return this.Act;
    }

    /**
     * Set Reserved field.
     * @param Act Reserved field.
     */
    public void setAct(String Act) {
        this.Act = Act;
    }

    /**
     * Get The mode. Values:
<li>`block`: Block</li>
<li>`observe`: Observer</li> 
     * @return Mode The mode. Values:
<li>`block`: Block</li>
<li>`observe`: Observer</li>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set The mode. Values:
<li>`block`: Block</li>
<li>`observe`: Observer</li>
     * @param Mode The mode. Values:
<li>`block`: Block</li>
<li>`observe`: Observer</li>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li> 
     * @return Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     * @param Switch Switch. Values:
<li>`on`: Enable</li>
<li>`off`: Disable</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    public WafGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroupInfo(WafGroupInfo source) {
        if (source.WafGroupDetails != null) {
            this.WafGroupDetails = new WafGroupDetail[source.WafGroupDetails.length];
            for (int i = 0; i < source.WafGroupDetails.length; i++) {
                this.WafGroupDetails[i] = new WafGroupDetail(source.WafGroupDetails[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.Act != null) {
            this.Act = new String(source.Act);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "WafGroupDetails.", this.WafGroupDetails);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Act", this.Act);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Switch", this.Switch);

    }
}


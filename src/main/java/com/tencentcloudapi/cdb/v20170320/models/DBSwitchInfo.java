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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBSwitchInfo extends AbstractModel{

    /**
    * Switch time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-09-03 01:34:31
    */
    @SerializedName("SwitchTime")
    @Expose
    private String SwitchTime;

    /**
    * Switch type. Value range: TRANSFER (data migration), MASTER2SLAVE (primary/secondary switch), RECOVERY (primary/secondary recovery)
    */
    @SerializedName("SwitchType")
    @Expose
    private String SwitchType;

    /**
     * Get Switch time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-09-03 01:34:31 
     * @return SwitchTime Switch time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-09-03 01:34:31
     */
    public String getSwitchTime() {
        return this.SwitchTime;
    }

    /**
     * Set Switch time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-09-03 01:34:31
     * @param SwitchTime Switch time in the format of yyyy-MM-dd HH:mm:ss, such as 2017-09-03 01:34:31
     */
    public void setSwitchTime(String SwitchTime) {
        this.SwitchTime = SwitchTime;
    }

    /**
     * Get Switch type. Value range: TRANSFER (data migration), MASTER2SLAVE (primary/secondary switch), RECOVERY (primary/secondary recovery) 
     * @return SwitchType Switch type. Value range: TRANSFER (data migration), MASTER2SLAVE (primary/secondary switch), RECOVERY (primary/secondary recovery)
     */
    public String getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set Switch type. Value range: TRANSFER (data migration), MASTER2SLAVE (primary/secondary switch), RECOVERY (primary/secondary recovery)
     * @param SwitchType Switch type. Value range: TRANSFER (data migration), MASTER2SLAVE (primary/secondary switch), RECOVERY (primary/secondary recovery)
     */
    public void setSwitchType(String SwitchType) {
        this.SwitchType = SwitchType;
    }

    public DBSwitchInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBSwitchInfo(DBSwitchInfo source) {
        if (source.SwitchTime != null) {
            this.SwitchTime = new String(source.SwitchTime);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new String(source.SwitchType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SwitchTime", this.SwitchTime);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);

    }
}


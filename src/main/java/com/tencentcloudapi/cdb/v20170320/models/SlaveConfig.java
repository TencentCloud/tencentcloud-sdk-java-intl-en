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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlaveConfig extends AbstractModel {

    /**
    * Replication mode of the secondary database. Value range: async, semi-sync
    */
    @SerializedName("ReplicationMode")
    @Expose
    private String ReplicationMode;

    /**
    * AZ name of the secondary database, such as ap-shanghai-1
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get Replication mode of the secondary database. Value range: async, semi-sync 
     * @return ReplicationMode Replication mode of the secondary database. Value range: async, semi-sync
     */
    public String getReplicationMode() {
        return this.ReplicationMode;
    }

    /**
     * Set Replication mode of the secondary database. Value range: async, semi-sync
     * @param ReplicationMode Replication mode of the secondary database. Value range: async, semi-sync
     */
    public void setReplicationMode(String ReplicationMode) {
        this.ReplicationMode = ReplicationMode;
    }

    /**
     * Get AZ name of the secondary database, such as ap-shanghai-1 
     * @return Zone AZ name of the secondary database, such as ap-shanghai-1
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ name of the secondary database, such as ap-shanghai-1
     * @param Zone AZ name of the secondary database, such as ap-shanghai-1
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public SlaveConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlaveConfig(SlaveConfig source) {
        if (source.ReplicationMode != null) {
            this.ReplicationMode = new String(source.ReplicationMode);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReplicationMode", this.ReplicationMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}


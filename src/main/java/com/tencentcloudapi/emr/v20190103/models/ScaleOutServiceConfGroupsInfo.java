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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScaleOutServiceConfGroupsInfo extends AbstractModel {

    /**
    * Component version name, for example, HDFS-2.8.5.
    */
    @SerializedName("ServiceComponentName")
    @Expose
    private String ServiceComponentName;

    /**
    * Configuration group name, for example, hdfs-core-defaultGroup. If the ConfGroupName parameter is passed in, the configuration group dimension is used.
                                                             If the ConfGroupName parameter is not passed in, the cluster dimension is used.
    */
    @SerializedName("ConfGroupName")
    @Expose
    private String ConfGroupName;

    /**
     * Get Component version name, for example, HDFS-2.8.5. 
     * @return ServiceComponentName Component version name, for example, HDFS-2.8.5.
     */
    public String getServiceComponentName() {
        return this.ServiceComponentName;
    }

    /**
     * Set Component version name, for example, HDFS-2.8.5.
     * @param ServiceComponentName Component version name, for example, HDFS-2.8.5.
     */
    public void setServiceComponentName(String ServiceComponentName) {
        this.ServiceComponentName = ServiceComponentName;
    }

    /**
     * Get Configuration group name, for example, hdfs-core-defaultGroup. If the ConfGroupName parameter is passed in, the configuration group dimension is used.
                                                             If the ConfGroupName parameter is not passed in, the cluster dimension is used. 
     * @return ConfGroupName Configuration group name, for example, hdfs-core-defaultGroup. If the ConfGroupName parameter is passed in, the configuration group dimension is used.
                                                             If the ConfGroupName parameter is not passed in, the cluster dimension is used.
     */
    public String getConfGroupName() {
        return this.ConfGroupName;
    }

    /**
     * Set Configuration group name, for example, hdfs-core-defaultGroup. If the ConfGroupName parameter is passed in, the configuration group dimension is used.
                                                             If the ConfGroupName parameter is not passed in, the cluster dimension is used.
     * @param ConfGroupName Configuration group name, for example, hdfs-core-defaultGroup. If the ConfGroupName parameter is passed in, the configuration group dimension is used.
                                                             If the ConfGroupName parameter is not passed in, the cluster dimension is used.
     */
    public void setConfGroupName(String ConfGroupName) {
        this.ConfGroupName = ConfGroupName;
    }

    public ScaleOutServiceConfGroupsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScaleOutServiceConfGroupsInfo(ScaleOutServiceConfGroupsInfo source) {
        if (source.ServiceComponentName != null) {
            this.ServiceComponentName = new String(source.ServiceComponentName);
        }
        if (source.ConfGroupName != null) {
            this.ConfGroupName = new String(source.ConfGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceComponentName", this.ServiceComponentName);
        this.setParamSimple(map, prefix + "ConfGroupName", this.ConfGroupName);

    }
}


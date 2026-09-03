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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HDFSConfig extends AbstractModel {

    /**
    * Cluster instance ID, such as emr-xxxxxxxx.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get Cluster instance ID, such as emr-xxxxxxxx. 
     * @return Id Cluster instance ID, such as emr-xxxxxxxx.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Cluster instance ID, such as emr-xxxxxxxx.
     * @param Id Cluster instance ID, such as emr-xxxxxxxx.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Path. 
     * @return Path Path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Path.
     * @param Path Path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public HDFSConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HDFSConfig(HDFSConfig source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}


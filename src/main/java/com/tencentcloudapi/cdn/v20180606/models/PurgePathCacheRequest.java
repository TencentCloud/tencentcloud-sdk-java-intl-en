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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PurgePathCacheRequest extends AbstractModel{

    /**
    * List of directories. The protocol header such as "http://" or "https://" needs to be included.
    */
    @SerializedName("Paths")
    @Expose
    private String [] Paths;

    /**
    * Purge type:
`flush`: purges updated resources
`delete`: purges all resources
    */
    @SerializedName("FlushType")
    @Expose
    private String FlushType;

    /**
     * Get List of directories. The protocol header such as "http://" or "https://" needs to be included. 
     * @return Paths List of directories. The protocol header such as "http://" or "https://" needs to be included.
     */
    public String [] getPaths() {
        return this.Paths;
    }

    /**
     * Set List of directories. The protocol header such as "http://" or "https://" needs to be included.
     * @param Paths List of directories. The protocol header such as "http://" or "https://" needs to be included.
     */
    public void setPaths(String [] Paths) {
        this.Paths = Paths;
    }

    /**
     * Get Purge type:
`flush`: purges updated resources
`delete`: purges all resources 
     * @return FlushType Purge type:
`flush`: purges updated resources
`delete`: purges all resources
     */
    public String getFlushType() {
        return this.FlushType;
    }

    /**
     * Set Purge type:
`flush`: purges updated resources
`delete`: purges all resources
     * @param FlushType Purge type:
`flush`: purges updated resources
`delete`: purges all resources
     */
    public void setFlushType(String FlushType) {
        this.FlushType = FlushType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Paths.", this.Paths);
        this.setParamSimple(map, prefix + "FlushType", this.FlushType);

    }
}


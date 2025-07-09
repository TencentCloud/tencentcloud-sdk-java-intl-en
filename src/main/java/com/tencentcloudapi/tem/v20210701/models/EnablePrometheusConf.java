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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnablePrometheusConf extends AbstractModel {

    /**
    * The listening port of the applicaiton
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * URL path for monitoring
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
     * Get The listening port of the applicaiton 
     * @return Port The listening port of the applicaiton
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set The listening port of the applicaiton
     * @param Port The listening port of the applicaiton
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get URL path for monitoring 
     * @return Path URL path for monitoring
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set URL path for monitoring
     * @param Path URL path for monitoring
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    public EnablePrometheusConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnablePrometheusConf(EnablePrometheusConf source) {
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Path", this.Path);

    }
}


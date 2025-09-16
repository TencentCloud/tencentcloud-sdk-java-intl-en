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

public class HTTPGetAction extends AbstractModel {

    /**
    * HTTP path.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Called port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get HTTP path. 
     * @return Path HTTP path.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set HTTP path.
     * @param Path HTTP path.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Called port. 
     * @return Port Called port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Called port.
     * @param Port Called port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public HTTPGetAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HTTPGetAction(HTTPGetAction source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}


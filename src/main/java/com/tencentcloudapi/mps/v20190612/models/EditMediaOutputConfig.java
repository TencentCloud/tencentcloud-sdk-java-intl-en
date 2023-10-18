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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditMediaOutputConfig extends AbstractModel {

    /**
    * The container. Valid values: `mp4` (default), `hls`, `mov`, `flv`, `avi`.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Container")
    @Expose
    private String Container;

    /**
    * The clip mode. Valid values: `normal` (default), `fast`.
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get The container. Valid values: `mp4` (default), `hls`, `mov`, `flv`, `avi`.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Container The container. Valid values: `mp4` (default), `hls`, `mov`, `flv`, `avi`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getContainer() {
        return this.Container;
    }

    /**
     * Set The container. Valid values: `mp4` (default), `hls`, `mov`, `flv`, `avi`.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Container The container. Valid values: `mp4` (default), `hls`, `mov`, `flv`, `avi`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setContainer(String Container) {
        this.Container = Container;
    }

    /**
     * Get The clip mode. Valid values: `normal` (default), `fast`.
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Type The clip mode. Valid values: `normal` (default), `fast`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The clip mode. Valid values: `normal` (default), `fast`.
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Type The clip mode. Valid values: `normal` (default), `fast`.
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public EditMediaOutputConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditMediaOutputConfig(EditMediaOutputConfig source) {
        if (source.Container != null) {
            this.Container = new String(source.Container);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Container", this.Container);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}


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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealtimeSpeechConf extends AbstractModel{

    /**
    * Voice chat status. Valid values: open, close
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Voice Chat sound quality type. Valid values: high (HD), ordinary (SD). Default value: ordinary
    */
    @SerializedName("Quality")
    @Expose
    private String Quality;

    /**
     * Get Voice chat status. Valid values: open, close 
     * @return Status Voice chat status. Valid values: open, close
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Voice chat status. Valid values: open, close
     * @param Status Voice chat status. Valid values: open, close
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Voice Chat sound quality type. Valid values: high (HD), ordinary (SD). Default value: ordinary 
     * @return Quality Voice Chat sound quality type. Valid values: high (HD), ordinary (SD). Default value: ordinary
     */
    public String getQuality() {
        return this.Quality;
    }

    /**
     * Set Voice Chat sound quality type. Valid values: high (HD), ordinary (SD). Default value: ordinary
     * @param Quality Voice Chat sound quality type. Valid values: high (HD), ordinary (SD). Default value: ordinary
     */
    public void setQuality(String Quality) {
        this.Quality = Quality;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Quality", this.Quality);

    }
}


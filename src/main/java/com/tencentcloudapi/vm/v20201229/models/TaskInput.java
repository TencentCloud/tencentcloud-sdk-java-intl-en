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
package com.tencentcloudapi.vm.v20201229.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskInput extends AbstractModel {

    /**
    * This field is optional and indicates the data ID assigned by you to the object to be detected for easier file identification and management.<br>It **can contain up to 64 letters, digits, and special symbols (_-@#)**.
    */
    @SerializedName("DataId")
    @Expose
    private String DataId;

    /**
    * This field is optional and indicates the name of a moderation task for subsequent query and management of moderation tasks.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * This field is required and indicates the access parameter of the moderated file, which is used to get the moderated media file and contains the access type and address.
    */
    @SerializedName("Input")
    @Expose
    private StorageInfo Input;

    /**
     * Get This field is optional and indicates the data ID assigned by you to the object to be detected for easier file identification and management.<br>It **can contain up to 64 letters, digits, and special symbols (_-@#)**. 
     * @return DataId This field is optional and indicates the data ID assigned by you to the object to be detected for easier file identification and management.<br>It **can contain up to 64 letters, digits, and special symbols (_-@#)**.
     */
    public String getDataId() {
        return this.DataId;
    }

    /**
     * Set This field is optional and indicates the data ID assigned by you to the object to be detected for easier file identification and management.<br>It **can contain up to 64 letters, digits, and special symbols (_-@#)**.
     * @param DataId This field is optional and indicates the data ID assigned by you to the object to be detected for easier file identification and management.<br>It **can contain up to 64 letters, digits, and special symbols (_-@#)**.
     */
    public void setDataId(String DataId) {
        this.DataId = DataId;
    }

    /**
     * Get This field is optional and indicates the name of a moderation task for subsequent query and management of moderation tasks. 
     * @return Name This field is optional and indicates the name of a moderation task for subsequent query and management of moderation tasks.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set This field is optional and indicates the name of a moderation task for subsequent query and management of moderation tasks.
     * @param Name This field is optional and indicates the name of a moderation task for subsequent query and management of moderation tasks.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get This field is required and indicates the access parameter of the moderated file, which is used to get the moderated media file and contains the access type and address. 
     * @return Input This field is required and indicates the access parameter of the moderated file, which is used to get the moderated media file and contains the access type and address.
     */
    public StorageInfo getInput() {
        return this.Input;
    }

    /**
     * Set This field is required and indicates the access parameter of the moderated file, which is used to get the moderated media file and contains the access type and address.
     * @param Input This field is required and indicates the access parameter of the moderated file, which is used to get the moderated media file and contains the access type and address.
     */
    public void setInput(StorageInfo Input) {
        this.Input = Input;
    }

    public TaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskInput(TaskInput source) {
        if (source.DataId != null) {
            this.DataId = new String(source.DataId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Input != null) {
            this.Input = new StorageInfo(source.Input);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DataId", this.DataId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Input.", this.Input);

    }
}


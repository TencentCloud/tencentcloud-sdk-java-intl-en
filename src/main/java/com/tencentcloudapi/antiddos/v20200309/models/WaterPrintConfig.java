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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintConfig extends AbstractModel{

    /**
    * Watermark offset. Value range: [0, 100).
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Start status. Valid values:
`0`: manual start
`1`: instant start
]
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
    * List of forwarding listeners configured
    */
    @SerializedName("Listeners")
    @Expose
    private ForwardListener [] Listeners;

    /**
    * A list of watermark keys is generated after a watermark is added successfully. Each watermark can have up to 2 keys. When there is only one valid key, it cannot be deleted.
    */
    @SerializedName("Keys")
    @Expose
    private WaterPrintKey [] Keys;

    /**
    * Watermark checking mode, which can be:
`checkall`: normal mode
`shortfpcheckall`: compact mode
]
    */
    @SerializedName("Verify")
    @Expose
    private String Verify;

    /**
     * Get Watermark offset. Value range: [0, 100). 
     * @return Offset Watermark offset. Value range: [0, 100).
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Watermark offset. Value range: [0, 100).
     * @param Offset Watermark offset. Value range: [0, 100).
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Start status. Valid values:
`0`: manual start
`1`: instant start
] 
     * @return OpenStatus Start status. Valid values:
`0`: manual start
`1`: instant start
]
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set Start status. Valid values:
`0`: manual start
`1`: instant start
]
     * @param OpenStatus Start status. Valid values:
`0`: manual start
`1`: instant start
]
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get List of forwarding listeners configured 
     * @return Listeners List of forwarding listeners configured
     */
    public ForwardListener [] getListeners() {
        return this.Listeners;
    }

    /**
     * Set List of forwarding listeners configured
     * @param Listeners List of forwarding listeners configured
     */
    public void setListeners(ForwardListener [] Listeners) {
        this.Listeners = Listeners;
    }

    /**
     * Get A list of watermark keys is generated after a watermark is added successfully. Each watermark can have up to 2 keys. When there is only one valid key, it cannot be deleted. 
     * @return Keys A list of watermark keys is generated after a watermark is added successfully. Each watermark can have up to 2 keys. When there is only one valid key, it cannot be deleted.
     */
    public WaterPrintKey [] getKeys() {
        return this.Keys;
    }

    /**
     * Set A list of watermark keys is generated after a watermark is added successfully. Each watermark can have up to 2 keys. When there is only one valid key, it cannot be deleted.
     * @param Keys A list of watermark keys is generated after a watermark is added successfully. Each watermark can have up to 2 keys. When there is only one valid key, it cannot be deleted.
     */
    public void setKeys(WaterPrintKey [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get Watermark checking mode, which can be:
`checkall`: normal mode
`shortfpcheckall`: compact mode
] 
     * @return Verify Watermark checking mode, which can be:
`checkall`: normal mode
`shortfpcheckall`: compact mode
]
     */
    public String getVerify() {
        return this.Verify;
    }

    /**
     * Set Watermark checking mode, which can be:
`checkall`: normal mode
`shortfpcheckall`: compact mode
]
     * @param Verify Watermark checking mode, which can be:
`checkall`: normal mode
`shortfpcheckall`: compact mode
]
     */
    public void setVerify(String Verify) {
        this.Verify = Verify;
    }

    public WaterPrintConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterPrintConfig(WaterPrintConfig source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.OpenStatus != null) {
            this.OpenStatus = new Long(source.OpenStatus);
        }
        if (source.Listeners != null) {
            this.Listeners = new ForwardListener[source.Listeners.length];
            for (int i = 0; i < source.Listeners.length; i++) {
                this.Listeners[i] = new ForwardListener(source.Listeners[i]);
            }
        }
        if (source.Keys != null) {
            this.Keys = new WaterPrintKey[source.Keys.length];
            for (int i = 0; i < source.Keys.length; i++) {
                this.Keys[i] = new WaterPrintKey(source.Keys[i]);
            }
        }
        if (source.Verify != null) {
            this.Verify = new String(source.Verify);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamArrayObj(map, prefix + "Listeners.", this.Listeners);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "Verify", this.Verify);

    }
}


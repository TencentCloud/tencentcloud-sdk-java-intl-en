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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlarmAnalysisConfig extends AbstractModel {

    /**
    * Keys. The following keys are supported:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.
Format: Display format. Value supports 1: One log per line; 2: One field per line per log.
Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * Value.
Key corresponds to the following values:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.Format: Display format. Value supports 1: One log per line; 2: One field per line per log.Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * Get Keys. The following keys are supported:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.
Format: Display format. Value supports 1: One log per line; 2: One field per line per log.
Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Key Keys. The following keys are supported:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.
Format: Display format. Value supports 1: One log per line; 2: One field per line per log.
Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set Keys. The following keys are supported:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.
Format: Display format. Value supports 1: One log per line; 2: One field per line per log.
Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Key Keys. The following keys are supported:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.
Format: Display format. Value supports 1: One log per line; 2: One field per line per log.
Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get Value.
Key corresponds to the following values:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.Format: Display format. Value supports 1: One log per line; 2: One field per line per log.Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Value Value.
Key corresponds to the following values:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.Format: Display format. Value supports 1: One log per line; 2: One field per line per log.Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set Value.
Key corresponds to the following values:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.Format: Display format. Value supports 1: One log per line; 2: One field per line per log.Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Value Value.
Key corresponds to the following values:
SyntaxRule: Syntax rule, value supports 0: Lucene syntax; 1: CQL syntax.
QueryIndex: Serial number of execution statement. Value supports -1: Custom; 1: Execute Statement 1; 2: Execute Statement 2.CustomQuery: Search statement. Valid and required when QueryIndex is -1, example of value: "* | select count(*) as count".Fields: Fields. Value supports __SOURCE__; __FILENAME__; __HOSTNAME__; __TIMESTAMP__; __INDEX_STATUS__; __PKG_LOGID__; __TOPIC__.Format: Display format. Value supports 1: One log per line; 2: One field per line per log.Limit: Maximum number of logs. Example of value: 5.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    public AlarmAnalysisConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlarmAnalysisConfig(AlarmAnalysisConfig source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}


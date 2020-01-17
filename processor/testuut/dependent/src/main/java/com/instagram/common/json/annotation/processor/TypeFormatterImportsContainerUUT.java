// Copyright 2004-present Facebook. All Rights Reserved.

package com.instagram.common.json.annotation.processor.dependent;

import com.instagram.common.json.annotation.JsonField;
import com.instagram.common.json.annotation.JsonType;
import com.instagram.common.json.annotation.processor.parent.TypeFormatterImportsUUT;

/** A container to exercise the callee imports tools */
@JsonType
public class TypeFormatterImportsContainerUUT {
  @JsonField(fieldName = "callee_ref")
  public TypeFormatterImportsUUT mTypeFormatterImports;
}

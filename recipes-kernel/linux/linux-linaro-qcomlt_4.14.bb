# Copyright (C) 2014-2018 Linaro
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Linaro Qualcomm Landing team 4.14 Kernel"

inherit pythonnative

require recipes-kernel/linux/linux-linaro-qcom.inc
require recipes-kernel/linux/linux-dtb.inc
require recipes-kernel/linux/linux-qcom-bootimg.inc

LOCALVERSION ?= "-linaro-lt-qcom"
SRCBRANCH ?= "release/qcomlt-4.14"
SRCREV ?= "a0bbc24175535dc7e4ec898f36c8070ae3c67b2c"

COMPATIBLE_MACHINE = "(ifc6410|sd-600eval|dragonboard-410c)"

# Wifi firmware has a recognizable arch :( 
ERROR_QA_remove = "arch"

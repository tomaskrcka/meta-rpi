SUMMARY = "Qt5 QML application for customer"
HOMEPAGE = "http://www.nkgroup.cz"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtdeclarative qtquickcontrols qtquickcontrols2 qtvirtualkeyboard"

PR = "r1"

#SRCREV = "21214e15acf0f66157e97ebb98de05e7419764d9"
SRC_URI = "http://nkgroup.cz/defect.zip"
SRC_URI[md5sum] = "3b78c857847d65ea907381c412580656"

S = "${WORKDIR}/tomaskrcka-elkamet_defect-82bffbdf0e06"

require recipes-qt/qt5/qt5.inc

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/elkamet_srot ${D}${bindir}
}

FILES_${PN} = "${bindir}"

RDEPENDS_${PN} = "qtdeclarative-qmlplugins qtquickcontrols-qmlplugins" 
